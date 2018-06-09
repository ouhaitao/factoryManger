package model;

import po.Material;
import po.Order;
interface Rate{
    String getRate(int a,int b);
}

/**
 * 订单数据模型
 */
public class OrderModel {
    private int id;//订单id
    private int size;//产品型号
    private int productnum;//产品数量
    private String rate;//产品进度
  //  private String mname;
    private int predict;
    private int reality;
    private int consume;
    private int scrap;

    public OrderModel(Order order, Material material){
        this.id=order.getId();
        this.size=order.getSize();
        this.productnum=order.getProductNum();
        Rate r;
        r=(a,b)->{
            return a/b*100+"%";
        };
        this.rate=r.getRate(order.getRate(),order.getProductNum());
        this.predict = material.getPredict();
        this.reality=material.getReality();
        this.consume=material.getConsume();
        this.scrap=material.getScrap();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
}
