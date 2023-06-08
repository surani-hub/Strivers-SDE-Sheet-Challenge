class Interval {
    int start, finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "[" + start + ", " + finish + "]";
    }
}