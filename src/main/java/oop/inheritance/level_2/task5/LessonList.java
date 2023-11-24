package oop.inheritance.level_2.task5;

public class LessonList extends  Lesson{
    private Lesson lessons[] = {
            new  Lesson(new Time(12,11,12),"ls2210"),
            new  Lesson(new Time(12,11,0),"ls2236"),
            new  Lesson(new Time(10,00,00),"ls2204")
    };


    public void counter(){
    Lesson temp;
        for (int i = 0; i < lessons.length-1 ; i++) {
            for (int j = 1; j< lessons.length ;j++ ){
                if(lessons[i].time.getHours()> lessons[j].time.getHours()){
                    temp = lessons[i];
                    lessons[i] = lessons[j];
                    lessons[j] = temp;
                }else{
                    if(lessons[i].time.getHours() == lessons[j].time.getHours()){
                        if(lessons[i].time.getMinute() > lessons[j].time.getMinute()) {
                            temp = lessons[i];
                            lessons[i] = lessons[j];
                            lessons[j] = temp;
                        }else{
                            if(lessons[i].time.getMinute() == lessons[j].time.getMinute())
                                if(lessons[i].time.getSecond() > lessons[j].time.getSecond()){
                                    temp = lessons[i];
                                    lessons[i] = lessons[j];
                                    lessons[j] = temp;
                                }
                        }
                    }
                }
            }

        }
        for (Lesson lesson:lessons) {
            System.out.println(lesson);
        }

    }

}
