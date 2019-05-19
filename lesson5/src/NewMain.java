public class NewMain {
    public static void main(String[] args) {
        Sotrudnik[] sotrArr = new Sotrudnik[5];
        sotrArr[0] = new Sotrudnik("Ivanov A A", "Inzener", "ivanov@mail.ru", "1234567", 30000, 30);
        sotrArr[1] = new Sotrudnik("Denisov A A", "Inzener", "denisov@mail.ru", "1234327", 39000, 45);
        sotrArr[2] = new Sotrudnik("Semenov A A", "Director", "semenofAA@mail.ru", "1110111", 30000000, 19);
        sotrArr[3] = new Sotrudnik("Ptichkin A A", "programmist", "pti4kin@gmail.com", "3617390", 28000, 65);
        sotrArr[4] = new Sotrudnik("Lapushka A A", "Sekretar", "ya_lapushka@mail.ru", "7676374", 230000, 18);

        for(Sotrudnik a: sotrArr)if(a.getVozrast()>40)a.printInfo();
    }
}
