package po;

/**
 * 原料清单
 * 记录每个订单各个流程的原料领取和使用情况
 */
public class Material {
    private int oid;//订单id
    private int process;//订单当前流程
    private int mid;//原料id（对应仓库id）
    private int predict;//预计领取原料
    private int reality;//实际领取的原料
    private int consume;//已使用的原料
    private int scrap;//废料

    public Material(int oid, int process, int mid, int predict, int reality, int consume, int scrap) {
        this.oid = oid;
        this.process = process;
        this.mid = mid;
        this.predict = predict;
        this.reality = reality;
        this.consume = consume;
        this.scrap = scrap;
    }

    public Material() {

    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
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
