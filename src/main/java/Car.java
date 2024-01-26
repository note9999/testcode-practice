public class Car {

    private int positon;

    public Car(){
            this.positon = 0;
        }
        // 명령한 수만큼 move() 메서드 실행
        public void moveOrder(final int orderCount){
            this.positon += orderCount;
    }
    public int getPositon(){
        return positon;
    }
}

