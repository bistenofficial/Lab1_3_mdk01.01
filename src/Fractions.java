public class Fractions {

    private int _wholeNum;
    private int _numberDigitsFractionalNumPoint;
    private int _fractionalNum;
    public Fractions(String num) {
        String[] arr2 = new String[2];
        String[] arr = num.split("\\.");
        if (arr.length == 2) {
            _numberDigitsFractionalNumPoint = arr[1].length();
            SetFractionalNum(Integer.valueOf(arr[1]));
            SetWholeNum(Integer.valueOf(arr[0]));
        } else {
            _numberDigitsFractionalNumPoint = 0;
            SetFractionalNum(0);
            SetWholeNum(Integer.valueOf(arr[0]));
        }


    }

    public void SetFractionalNum(int fractionalNum) throws IllegalArgumentException {
        if (fractionalNum >= 0) {
            this._fractionalNum = fractionalNum;
        } else {
            throw new IllegalArgumentException("Ввели отрицательную дробь");
        }
    }

    public void SetWholeNum(int wholeNum) {
        this._wholeNum = wholeNum;
    }

    public int GetWholeNum() {
        return _wholeNum;
    }

    public int GetFractionalNum() {
        return _fractionalNum;
    }

    public int GetNumberDigitsFractionalNumPoint() {
        return _numberDigitsFractionalNumPoint;
    }

    private int GetSign(int num) {
        if (num >= 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public double Summ(Fractions fractions) {
        return _wholeNum + _fractionalNum / Math.pow(10, _numberDigitsFractionalNumPoint) * GetSign(_wholeNum) + fractions.GetWholeNum() +
                fractions.GetFractionalNum() / Math.pow(10, fractions.GetNumberDigitsFractionalNumPoint()) * GetSign(fractions.GetWholeNum());
    }

}
