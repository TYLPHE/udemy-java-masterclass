public class Main {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i += 1) {
            RecordProject.LPAStudent s = new RecordProject.LPAStudent("S92300" + i,
                switch(i) {
                    case 1 -> "Mary";
                    case 2 -> "Carol";
                    case 3 -> "Tim";
                    case 4 -> "Harry";
                    case 5 -> "Lisa";
                    default -> "Anonymous";
                }, 
                "05/11/1987", 
                "Java Masterclass");

            System.out.println(s);
        }

        RecordProject.Student pojoStudent = new RecordProject.Student("S923006", "Ann", "05/11/1986", "Java");
        RecordProject.LPAStudent recordStudent = new RecordProject.LPAStudent("S923007", "Bill", "05/11/1976", "Java");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java II");
        // recordStudent.setClassList(recordStudent.classList() + ", Java II");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());        
    }
}
