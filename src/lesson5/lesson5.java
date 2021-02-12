package lesson5;

public class lesson5 {
    public static void main(String[] args) {

        worker workers[] = new worker[5];
        workers[0]=new worker("Ivan","Engineer", "ivan@mail.com", "+123", 2000, 31);
        workers[1]=new worker("Maks","Engineer", "max@mail.com", "+134", 4000, 45);
        workers[2]=new worker("Dan","Director", "dir@mail.com", "+111", 10000, 56);
        workers[3]=new worker("Yana","Office-manager", "yana@mail.com", "+133", 1300, 22);
        workers[4]=new worker("Anna","HR director", "HR@mail.com", "+343", 6000, 41);


        checkAge40(workers);

    }
    public static void checkAge40(worker workers[]){
        System.out.println("Список сотрудников старше 40 лет:\n");
        for (int i = 0; i <workers.length ; i++) {
            if (workers[i].age > 40){
                workers[i].workerDataPrint();
            }

        }

    }

    /*метод не работает. пока не работает
    public static worker[] createWorkersArray(){
        worker workersArray[] = new worker[5];
        workersArray[0]=new worker("Ivan","Engineer", "ivan@mail.com", "+123", 2000, 31);
        workers[1]=new worker("Maks","Engineer", "max@mail.com", "+134", 4000, 45);
        workers[2]=new worker("Dan","Director", "dir@mail.com", "+111", 10000, 56);
        workers[3]=new worker("Yana","Office-manager", "yana@mail.com", "+133", 1300, 22);
        workers[4]=new worker("Anna","HR director", "HR@mail.com", "+343", 6000, 41);
        return workers[];
    }*/

}

