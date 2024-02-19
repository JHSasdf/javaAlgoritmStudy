public enum Season {
    WINTER(1), SPRING(2), SUMMER(3), AUTUMN(4);
    //ordinal
    // 0,1,2,3
    
    private int value;

    public int getValue() {
        return value;
    }

    private Season(int value) {
        this.value = value;
    }
}