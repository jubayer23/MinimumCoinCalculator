package Model;

public class Amount {

    String rawAmount;
    long formattedAmount;

    public String getRawAmount() {
        return rawAmount;
    }

    public void setRawAmount(String rawAmount) {
        this.rawAmount = rawAmount;
    }

    public long getFormattedAmount() {
        return formattedAmount;
    }

    public void setFormattedAmount(long formattedAmount) {
        this.formattedAmount = formattedAmount;
    }

    /*
    *  A method to calculate the minimum number of Sterling coins equivalent to that amount.
    * */
    public String CalculateMinCoinDenominations() {
        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
        String[] coins_map = {"£2", "£1", "50p", "20p", "10p", "5p", "2p", "1p"};

        String result = "";


        for (int i = 0; i < coins.length; i++) {
            if (formattedAmount >= coins[i]) {
                //System.out.print((validInput / 200) + " X 2" + pound);
                result = result + (formattedAmount / coins[i]) + " x " + coins_map[i];
                formattedAmount = formattedAmount % coins[i];
                if (formattedAmount > 0) result = result + ", ";
            }
        }


        return result;
    }
}



