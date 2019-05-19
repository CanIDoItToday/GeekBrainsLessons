public class Sotrudnik {
    String fio;
    String dolznost;
    String email;
    String telefone;
    int zarplata;
    int vozrast;

    public Sotrudnik(String fio, String dolznost, String email, String telefone, int zarplata, int vozrast) {
        this.fio = fio;
        this.dolznost = dolznost;
        this.email = email;
        this.telefone = telefone;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }

    public void printInfo(){
        System.out.println("ФИО " +fio + " Должность " + dolznost+ " Почта " +email+ " Номер телефона " +telefone+ " Зарплата " +zarplata+ " Возраст " +vozrast);
    }

    public Sotrudnik(int vozrast) {
        this.vozrast = vozrast;
    }

    public int getVozrast() {
        return vozrast;
    }
}
