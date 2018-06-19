package Entregavel;

public class PricinpalMain {
    public static void main(String[] args) {

            DigitalHouseManager dhm = new DigitalHouseManager();

            //Registro de Cursos

            dhm.registrarCurso("Mobile",111,2);
            dhm.registrarCurso("FullStack",222,2);

            //Registro de Prof Adjuntos

            dhm.registrarProfessorAdjunto("Octavio","Detroit",352,5);
            dhm.registrarProfessorAdjunto("Cristiano","Lima",343,9);

            //Registro de Prof Titulares

            dhm.registrarProfessorTitular("Marcos","Souza",444,"Java");
            dhm.registrarProfessorTitular("Gabriel","Jesus",555,"Java");

            //Matricular Aluno
            dhm.matricularAluno("Gilberto", "Gomes",456);
            dhm.matricularAluno("Roberto", "Silva",698);
            dhm.matricularAluno("Mancuso", "Oliveira",981);
            dhm.matricularAluno("Baggio", "Rossi",777);

            //Alocar Professor no Curso
            //Codigo do Curso / Codido Prof Titular / Codigo Prof Adjunto
            dhm.alocarProfessores(111,444, 352);
            dhm.alocarProfessores(222,555, 343);



            //Excluir Professor
            //dhm.excluirProfessor(333);

            //Matricular aluno no Curso Mobile
            dhm.matricularAluno(458,369);
            dhm.matricularAluno(698,258);

            //Matricular aluno no CursoFullStack
            dhm.matricularAluno(652,725);
            dhm.matricularAluno(589,421);


                /*Quem faz o papel de instanciador é o New trata de reservar memória o suficiente
                 para o objeto e criar automaticamente uma referência a ele. Para new conseguir determinar o objeto,
                  precisamos usar o método construtor que será usado como base para instanciar a classe e gerar o
                  objeto
                  */
        }

    }








