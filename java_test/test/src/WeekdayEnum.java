/**
 * Created by Tong on 2016/11/12.
 */
public enum WeekdayEnum{
    Mon(1), Tue(2), Wen(3), Thus(4), Fri(5), Sat(6), Sun(7);

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index;

    WeekdayEnum(int index) {
        this.index = index;
    }
}
