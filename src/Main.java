public class Main {
    //задание полей
    static float telescope = 14_000; // стоимость телескопа
    static int account = 1_000; // счёт пользователя
    static float stipend = 2500; // ежемесячная стипендия
    static int percentFree = 100; // доля  стипендии на любые траты
    static float percentBank = 5; // годовая процентная ставка на накопления
    static float[] monthPayments = new float[120];

    private float telescopePriceWithContribution() {
        return telescope - account;}

    public static int countMonth(float total, float mortgageCosts, float percentBankYear) {
        float percentBankMonth = percentBankYear / 12;
        int count = 0;

        while (total > 0) {
            count++;

            float telescope = 14_000; // стоимость телескопа
            int account = 1_000; // счёт пользователя
            float stipend = 2500; // ежемесячная стипендия
            int percentFree = 100; // доля  стипендии на любые траты
            float percentBank = 5; // годовая процентная ставка на накопления
            float[] monthPayments = new float[120];
        }
            private float telescopePriceWithContribution() {
                return telescopePrice - account;
            }

            public int countMonth(float total, float mortgageCosts, float percentBankYear){
                float percentBankMonth = percentBankYear / 12;
                int count = 0;

                while (total > 0) {
                    count++;
                    total = (total + (total * percentBankMonth) / 100) - mortgageCosts;
                    if (total > mortgageCosts) {
                        monthlyPayments[count - 1] = mortgageCosts;
                    } else {
                        monthlyPayments[count - 1] = total;
                    }
                }
                if (total > mortgageCosts) {
                    monthlyPayments[count - 1] = mortgageCosts;
                } else {
                    monthlyPayments[count - 1] = total;
                }
            }
        }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Средства будут накапливаться " + countMonth(main.telescopePriceWithContribution), main.mortgageCosts(main.wage, main.percentFree), main.percentBank) + "месяцев");
        String monthlyPaymentsList = "";
        for (float list : monthlyPayments) {
            if(list>0) {
                monthlyPaymentsList = monthlyPaymentsList + Float.toString(list) + "монет";}
            else {
                break; }
        }
        System.out.println("Первоначальный взнос " + account + "монет, ежемесячные выплаты: "+ monthlyPaymentsList);
    }
    }
