package oop.inheritance.level_2.task3;

public class Remedy {
 protected String name;
 protected MyDate date;
 protected String firma;

 public Remedy() {
 }

 public Remedy(String name, MyDate date, String firma) {
  this.name = name;
  this.date = date;
  this.firma = firma;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public MyDate getDate() {
  return date;
 }

 public void setDate(MyDate date) {
  this.date = date;
 }

 public String getFirma() {
  return firma;
 }

 public void setFirma(String firma) {
  this.firma = firma;
 }

 @Override
 public String toString() {
  return "Remedy{" +
          "name='" + name + '\'' +
          ", date=" + date +
          ", firma='" + firma + '\'' +
          '}';
 }
}