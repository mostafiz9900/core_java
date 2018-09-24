package beSkilled_interface;

class Dog implements Animal, Animal1 {

    @Override
    public String eat() {
        return "Dog eiting Row meat";

    }

    @Override
    public String Run() {
        return "Dog quck run";
    }

}
