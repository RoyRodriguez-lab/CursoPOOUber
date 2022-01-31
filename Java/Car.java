class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;
// Requisitos obligatorios de la clase
    public Car (String license,Account Driver){
        this.license = license;
        this.driver = driver;
    }



    void printDatacar (){

        System.out.println("License  " + license  + "Driver  " + driver);

    }
}