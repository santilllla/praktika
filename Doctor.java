public class Doctor {

  public String doc_name;
  public String doc_phone;
  public String skill;
  public String experience;

  public Doctor (String doc_name, String doc_phone, String skill, String experience) {
    this.doc_name = doc_name;
    this.doc_phone = doc_phone;
    this.skill = skill;
    this.experience = experience;
  }
  public void output_doctor() {
    System.out.println("Doctor name - " + doc_name);
    System.out.println("Doctor phone -" + doc_phone);
    System.out.println("Direction of activity -" + skill);
    System.out.println("Work experience - " + experience + "\n");
  }

  public String getExpereince() {
    return experience;
  }

  public void admission(){
    System.out.println("Patient admission is done." +  "\n");
  }

  public void purpose(){
    System.out.println("Treatment appoinments were assigned." + "\n");
  }

  public void introduction (){
    System.out.println("The patient was examined, treatment was prescribed and symptoms were recorded." + "\n");
  }

  public void appointment (){
    System.out.println("We recommend you to visit us again in a week." + "\n");
  }
}

