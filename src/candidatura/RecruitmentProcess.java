package candidatura;

public class RecruitmentProcess {

    static double baseSalary = 2000.0;

    public static void main(String[] args) {
        String[] names = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        Candidate[] candidates = new Candidate[names.length];

        for (int index = 0; index < names.length; index++) {
            candidates[index] = new Candidate(names[index]);
        }

        for (Candidate candidate : candidates) {

            if (candidate.desiredSalary() < baseSalary) {
                System.out.println("O candidato " + candidate.getName() + " Foi aprovado no processo seletivo");
                String name = candidate.getName();
                HR_Department.call(name);
                System.out.println("");
            }
        }
    }
}
