public class Main
{
  public static void main(String[] args) {
    Doctor doctor = new Doctor("Vasya","89365465465","14","Hgjh");
    System.out.println("Doctor:");
    doctor.output_doctor();

    Polyclinic_card card = new Polyclinic_card("Dana", "895656454", "01.02.2002", "gemoroy", "01.02.2021", "546845467");
    System.out.println("Patient:");
    card.output();
    System.out.println();

    Registrar registrar = new Registrar();
    registrar.setRegistrar_phone("83464451354");
    registrar.setRegistrar_experience("01.02.2020");
    registrar.output();

    registrar.request();
    registrar.data_entry();
    registrar.making();
    registrar.accepting();

    doctor.purpose();
    doctor.admission();
    doctor.purpose();
    doctor.introduction();
    doctor.appointment();
  }
}

