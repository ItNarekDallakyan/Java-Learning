package basic.strings.Ex184_205;

public class Task_198 {

    public static void main(String[] args) {

        String str = "ashxarh hrashq sirun gandz";
                                                      
                for(int i=0;i<str.length();i++){
                    str=str.replaceAll("  "," ");
                }
                String bar[]=str.split(" ");
                String minLingthBar=bar[0];
                for(int i=1;i<bar.length;i++){
                    if(bar[i].length()<minLingthBar.length()){
                        minLingthBar=bar[i];
                    }
                }
                
                System.out.println(minLingthBar);
            }
        }