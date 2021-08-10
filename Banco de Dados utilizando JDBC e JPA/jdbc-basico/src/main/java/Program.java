import dao.AlunoDAO;
import entities.Aluno;

import java.util.List;

public class Program {

    private static final AlunoDAO alunoDAO = new AlunoDAO();

    public static void main(String[] args) {

        // =========================== 1 - Consulta =================================================
        List<Aluno> alunos = alunoDAO.list();

        alunos.forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
//        Aluno alunoParaConsulta = alunoDAO.getById(1L);
//
//        System.out.println(alunoParaConsulta);


        // =========================== 2 - Inserção =================================================
//        Aluno alunoParaInsercao = new Aluno(null, "Matheus", 43, "SP");
//
//        alunoDAO.create(alunoParaInsercao);


        // =========================== 3 - Delete ===================================================
//        alunoDAO.delete(5L);


        // =========================== 4 - Atualizar ================================================
//        Aluno alunoParaAtualizar = alunoDAO.getById(3L);
//        alunoParaAtualizar.setNome("Joaquim");
//        alunoParaAtualizar.setIdade(18);
//        alunoParaAtualizar.setEstado("RS");

//        alunoDAO.update(alunoParaAtualizar);
    }
}
