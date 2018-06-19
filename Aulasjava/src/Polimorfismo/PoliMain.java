package Polimorfismo;

public class PoliMain {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara v = new Arara();

        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        v.locomover();

    }
}
