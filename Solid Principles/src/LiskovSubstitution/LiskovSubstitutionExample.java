package LiskovSubstitution;

public class LiskovSubstitutionExample {

    // Kötü örnek

    public class Bird {
        public void fly() {
        }
    }

    public class Duck extends Bird {
    }

    //Ördek bir kuş olduğu için uçabilir, ama buna ne dersiniz:

    public class Ostrich extends Bird {

    }
/*
    Devekuşu bir kuştur, ancak uçamaz, Devekuşu sınıfı Kuş sınıfının bir alt türüdür, ancak sinek yöntemini kullanamaz,
    bu da LSP ilkesini ihlal ettiğimiz anlamına gelir.*/

                ///////////////////////////////////////////////////////////////

    // İyi örnek

    public class Bird {
    }

    public class FlyingBirds extends Bird {
        public void fly() {
        }
    }

    public class Duck extends FlyingBirds {
    }

    public class Ostrich extends Bird {
    }

}
