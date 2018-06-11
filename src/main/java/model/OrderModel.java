package model;

import po.Material;
import po.Order;
import util.OrderState;

interface Rate{
    String getRate(int a,int b);
}

/**
 * 订单数据模型
 */
public class OrderModel {
    private int id;//订单id
    private String osize;//产品型号
    private int productnum;//产品数量
    private int producenum;//已生产数量
    private String rate;//产品进度
    private String state;//订单状态

    //  private String mname;
    private int predict;
    private int reality;
    private int consume;
    private int scrap;

    public OrderModel(Order order, Material material){
        this.id=order.getId();
        switch (order.getSize()){
            case 0:
                this.osize="小号";
                break;
            case 1:
                this.osize="中号";
                break;
            case 2:
                this.osize="大号";
                break;
            case 3:
                this.osize="加大号";
                break;
        }
        this.productnum=order.getProductNum();
        this.producenum=order.getRate();
        Rate r;
        r=(a,b)->{
            return a/b*100+"%";
        };
        this.rate=r.getRate(order.getRate(),order.getProductNum());
        this.state= OrderState.getState(order.getState());
        this.predict = material.getPredict();
        this.reality=material.getReality();
        this.consume=material.getConsume();
        this.scrap=material.getScrap();
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOsize() {
        return osize;
    }

    public void setOsize(int size) {
        switch (size){
            case 0:
                this.osize="小号";
                break;
            case 1:
                this.osize="中号";
                break;
            case 2:
                this.osize="大号";
                break;
            case 3:
                this.osize="加大号";
                break;
        }
    }

    public int getProducenum() {
        return producenum;
    }

    public void setProducenum(int producenum) {
        this.producenum = producenum;
    }

    public int getProductNum() {
        return productnum;
    }

    public void setProductNum(int productNum) {
        this.productnum = productNum;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getPredict() {
        return predict;
    }

    public void setPredict(int predict) {
        this.predict = predict;
    }

    public int getReality() {
        return reality;
    }

    public void setReality(int reality) {
        this.reality = reality;
    }

    public int getConsume() {
        return consume;
    }

    public void setConsume(int consume) {
        this.consume = consume;
    }

    public int getScrap() {
        return scrap;
    }

    public void setScrap(int scrap) {
        this.scrap = scrap;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "id=" + id +
                ", osize='" + osize + '\'' +
                ", productnum=" + productnum +
                ", producenum=" + producenum +
                ", rate='" + rate + '\'' +
                ", state='" + state + '\'' +
                ", predict=" + predict +
                ", reality=" + reality +
                ", consume=" + consume +
                ", scrap=" + scrap +
                '}';
    }
}
