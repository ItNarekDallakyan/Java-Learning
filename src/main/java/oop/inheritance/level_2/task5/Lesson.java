package oop.inheritance.level_2.task5;

public class Lesson {
 protected Time time;
 protected String audience;

 public Lesson() {
 }

 public Lesson(Time time, String audience) {
  this.time = time;
  this.audience = audience;
 }

 public Time getTime() {
  return time;
 }

 public void setTime(Time time) {
  this.time = time;
 }

 public String getAudience() {
  return audience;
 }

 public void setAudience(String audience) {
  this.audience = audience;
 }

 @Override
 public String toString() {
  return "Lesson{" +
          "time=" + time +
          ", audience='" + audience + '\'' +
          '}';
 }
}