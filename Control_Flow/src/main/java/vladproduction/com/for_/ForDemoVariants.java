package vladproduction.com.for_;

public class ForDemoVariants {
    public static void main(String[] args) {

        //Variant #1
        /*// Верхняя граница суммы и значение суммы
        // индексная переменная объявлена
        // в операторе цикла):
        int n=10,s=0;
        // Отображение верхней границы суммы:
        System.out.print("Сумма чисел от 1 до "+n+": ");
        // Оператор цикла:
        for(int k=1;k<=n;k++){ // Обратите внимание!!!
            s+=k; // Добавляем слагаемое в сумму
        }
        // Отображение результата:
        System.out.println(s);*/

        //Variant #2
        /*// Верхняя граница суммы, индексная переменная,
        // значение суммы:
        int n=10,k,s;
        // Отображение верхней границы суммы:
        System.out.print("Сумма чисел от 1 до "+n+": ");
        // Оператор цикла:
        for(k=1,s=0;k<=n;s+=k,k++);
        // Отображение результата:
        System.out.println(s);*/

        //Variant #3
        /*// Верхняя граница суммы, индексная переменная,
        // значение суммы:
        int n = 10, k = 1, s = 0;
        // Отображение верхней границы суммы:
        System.out.print("Сумма чисел от 1 до " + n + ": ");
        // Оператор цикла:
        for (; k <= n; ) {
            s += k; // Прибавление слагаемого к сумме
            k++; // Новое значение индексной переменной
        }
        // Отображение результата:
        System.out.println(s);*/

        //Variant #4
        /*// Верхняя граница суммы, индексная переменная,
        // значение суммы:
        int n=10,k=1,s=0;
        // Отображение верхней границы суммы:
        System.out.print("Сумма чисел от 1 до "+n+": ");
        // Оператор цикла:
        for(;;){
            s+=k; // Прибавление слагаемого к сумме
            k++; // Новое значение индексной переменной
            // Условный оператор:
            if(k>n) break;
        }
        // Отображение результата:
        System.out.println(s);*/
    }

}

