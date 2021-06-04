public class Patient {

  public String name;
  public String birthday;
  public String phone_number;
  
  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setBirthday(String birthday){
    this.birthday = birthday;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
  }

  public String getPhone_number() {
    return phone_number;
  }

  public void registration() {
    System.out.println("Registration is done.");
  }

  public void choosen() {
    System.out.println("Service selected.");
  }

  public void payment() {
    System.out.println("Payment is done.");
  }

  public void attending() {
    System.out.println("The doctor's appointment was completed.");
  }

  public void replay() {
    System.out.println("A second visit a week later was successful.");
  }
}

