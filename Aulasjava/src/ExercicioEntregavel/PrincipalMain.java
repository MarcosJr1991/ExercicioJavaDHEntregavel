package ExercicioEntregavel;

public class PrincipalMain {
    public static void main(String[] args) {




            DigitalHouseManager DHM = new DigitalHouseManager();

            //Registro de Cursos

            DHM.registrarCurso("Mobile", 7856, 2);
            DHM.registrarCurso("FullStack", 2569, 2);

            //Registro de Prof Adjuntos

            DHM.registrarProfessorAdjunto("Marcos", "Souza", 452, 5);
            DHM.registrarProfessorAdjunto("gabriel", "jesus", 369, 9);

            //Registro de Prof Titulares

            DHM.registrarProfessorTitular("eduardo", "oliveira", 444, "Java");
            DHM.registrarProfessorTitular("rossi", "ferrai", 555, "Java");


        {

        }

    }
}







