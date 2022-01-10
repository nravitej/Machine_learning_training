package fr.epita.titanic.datamodel;
import java.lang.*;

public class Passenger {

    //File Header : PassengerId,Pclass,Name,Sex,Age,SibSp,Parch,Ticket,Fare,Cabin,Embarked

    private Integer PassengerId;
    private Integer Survived;
    private Integer Pclass;
private String Name;
private String Sex;
private Double Age;
private Integer SibSp;
private Integer Parch;
private String Ticket;
private Integer Fare;
private String Cabin;
private String Embarked;

    public Integer getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.PassengerId = passengerId;
    }
    public Integer getSurvived() {
        return Survived;
    }

    public void setSurvived(Integer survived) {
        this.Survived = survived;
    }
    public Integer getPclass() {
        return Pclass;
    }

    public void setPclass(Integer pclass) {
        this.Pclass = pclass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        this.Sex = sex;
    }

    public Double getAge() {
        return Age;
    }

    public void setAge(Double age) {
        this.Age = age;
    }

    public Integer getSibSp() {
        return SibSp;
    }

    public void setSibSp(Integer sibSp) {
        this.SibSp = sibSp;
    }

    public Integer getParch() {
        return Parch;
    }

    public void setParch(Integer parch) {
        this.Parch = parch;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        this.Ticket = ticket;
    }

    public Integer getFare() {
        return Fare;
    }

    public void setFare(Integer fare) {
        this.Fare = fare;
    }

    public String getCabin() {
        return Cabin;
    }

    public void setCabin(String cabin) {
        this.Cabin = cabin;
    }

    public String getEmbarked() {
        return Embarked;
    }

    public void setEmbarked(String embarked) {
        this.Embarked = embarked;
    }
}
