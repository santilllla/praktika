public class Polyclinic_card extends Patient {
  
  public String card_number;
  public String diseases;
  public String appeal;

  public Polyclinic_card(String name, String phone_number, String birthday, String diseases, String appeal, String card_number) {
    super.name = name;
    super.phone_number = phone_number;
    super.birthday = birthday;
    this.diseases = diseases;
    this.appeal = appeal;
    this.card_number = card_number;
  }

  public void output() {
    System.out.println ("Name - " + super.name);
    System.out.println ("Phone number - " + super.phone_number);
    System.out.println ("Birthday - " + super.birthday);
    System.out.println ("Patient's diseases - " + diseases);
    System.out.println ("Patient's last appeal - " + appeal);
    System.out.println ("Number of the card - " + card_number);
  }

    void output() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

