package concurrency.level2.GasStationTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;




public class DBManager {
	private static DBManager instance;
	private Connection con;
	
	public static synchronized DBManager getInstance(){
		if(instance==null){
			instance=new DBManager();
		}
		return instance;
	}
	
	private DBManager(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("","","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertIntoDB(Car.TypeFuel fuel, int amount, int numCol, LocalDateTime date) {
		String sqlStat="INSERT INTO station_loadings (fuel_type, fuel_quantity, kolonka_id, loading_time) VALUES (?,?,?,?)";
		PreparedStatement statment;
		try {			
			statment = con.prepareStatement(sqlStat);
			statment.setString(1, fuel.toString());
			statment.setInt(2, amount);
			statment.setString(3, "Column "+numCol);
			statment.setTimestamp(4, Timestamp.valueOf(date));
			statment.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
	public void printAllLoadings(){
		String sqlStat="SELECT kolonka_id, fuel_type, fuel_quantity, loading_time FROM station_loadings";
		try {
			PreparedStatement statment=con.prepareStatement(sqlStat);
			ResultSet res=statment.executeQuery();
			//column->loadings
			TreeMap<String ,TreeSet<Loading>> loadings=new TreeMap<>();
			while(res.next()){
				String col=res.getString("kolonka_id");
				Loading l=new Loading(
						col,
						res.getString("fuel_type"),
						res.getInt("fuel_quantity"), 
						res.getTimestamp("loading_time").toLocalDateTime());
				if(!loadings.containsKey(col)){
					loadings.put(col, new TreeSet<Loading>());
				}
				loadings.get(col).add(l);
			}
			
			for(Entry<String , TreeSet<Loading>> e : loadings.entrySet()){
				System.out.println(e.getKey());
				for(Loading l: e.getValue()){
					System.out.println(l);
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL-"+e.getMessage());
		}
	}

	
	public void numberOfCars(){
		String sqlStat="SELECT kolonka_id, COUNT(*) AS cars FROM station_loadings GROUP BY kolonka_id HAVING Date(loading_time)=Date.now()";
		try {
			PreparedStatement statment=con.prepareStatement(sqlStat);
			ResultSet res=statment.executeQuery();
			TreeMap<String, Integer> map=new TreeMap<>();
			while(res.next()){
				String col=res.getString("kolonka_id");
				int num=res.getInt("cars");
				map.put(col, num);
			}
			for(Entry<String, Integer> e: map.entrySet()){
				System.out.println(e.getKey()+": "+e.getValue());
			}
		} catch (SQLException e) {
			System.out.println("SQL-"+e.getMessage());
		}
		
	}
	
	public void totalQuantityFuel(){
		String sqlStat="SELECT fuel_type SUM(fuel_quantity) AS totalQuantity FROM station_loadings GROUP BY fuel_type";
		try {
			PreparedStatement statment=con.prepareStatement(sqlStat);
			ResultSet res=statment.executeQuery();
			TreeMap<String, Integer> map=new TreeMap<>();
			while(res.next()){
				String fuelType=res.getString("fuel_type");
				int total=res.getInt("totalQuantity");
				map.put(fuelType, total);
			}
			for(Entry<String, Integer> e: map.entrySet()){
				System.out.println(e.getKey()+": "+e.getValue());
			}
			
		} catch (SQLException e) {
			System.out.println("SQL-"+e.getMessage());
		}
		
	}
	
	
	public void totalSumFuel(){
		String sqlStat="SELECT fuel_type SUM(fuel_quantity) AS totalQuantity FROM station_loadings GROUP BY fuel_type";
		PreparedStatement statment = null;
		ResultSet res=null;
		try {
			statment=con.prepareStatement(sqlStat);
			res=statment.executeQuery();
			TreeMap<String, Double> map=new TreeMap<>();
			while(res.next()){
				String fuelType=res.getString("fuel_type");
				int total=res.getInt("totalQuantity");
				double fin=(double)total;
				if(fuelType.equals(Car.TypeFuel.DIESEL.toString())){
					map.put(fuelType, fin*2.40);
				}
				else if(fuelType.equals(Car.TypeFuel.PETROL.toString())){
					map.put(fuelType, fin*2.00);
				}
				else if(fuelType.equals(Car.TypeFuel.GAS.toString())){
					map.put(fuelType, fin*1.60);
				}				
			}
			for(Entry<String, Double> e: map.entrySet()){
				System.out.println(e.getKey()+": "+e.getValue());
			}
			
		} catch (SQLException e) {
			System.out.println("SQL-"+e.getMessage());
		}
		finally {
			try {
				res.close();
				statment.close();
			} catch (SQLException e) {
				System.out.println("SQL-"+e.getMessage());
			}
		}
	}
	
	public void closeConnection(){
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("SQL-"+e.getMessage());
		}
	}
}
