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

    public String CalculateMinCoinDenominations() {
        String result = "";

        String pound = "£";
        if (formattedAmount >= 200) {
            //System.out.print((validInput / 200) + " X 2" + pound);
            result = result + (formattedAmount / 200) + " X 2" + pound;
            formattedAmount = formattedAmount % 200;
            if (formattedAmount > 0) result = result + ", ";
        }

        if (formattedAmount >= 100) {


            result = result + (formattedAmount / 100) + " X 1" + pound;
            formattedAmount = formattedAmount % 100;
            if (formattedAmount > 0) result = result + ", ";
        }

        if (formattedAmount >= 50) {


            result = result + (formattedAmount / 50) + " X 50p";
            formattedAmount = formattedAmount % 50;
            if (formattedAmount > 0) result = result + ", ";
        }

        if (formattedAmount >= 20) {


            result = result + (formattedAmount / 20) + " X 20p";
            formattedAmount = formattedAmount % 20;
            if (formattedAmount > 0) result = result + ", ";
        }

        if (formattedAmount >= 10) {


            result = result + (formattedAmount / 10) + " X 10p";
            formattedAmount = formattedAmount % 10;
            if (formattedAmount > 0) result = result + ", ";
        }

        if (formattedAmount >= 5) {


            result = result + (formattedAmount / 5) + " X 5p";
            formattedAmount = formattedAmount % 5;
            if (formattedAmount > 0) result = result + ", ";
        }

        if (formattedAmount >= 2) {


            result = result + (formattedAmount / 2) + " X 2p";
            formattedAmount = formattedAmount % 2;
            if (formattedAmount > 0) result = result + ", ";
        }

        if (formattedAmount >= 1) {


            result = result + (formattedAmount / 1) + " X 1p";
            formattedAmount = 0L;
        }

        return result;
    }
}



