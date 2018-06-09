package po;

/**
 * 原料清单
 * 记录每个订单各个流程的原料领取和使用情况
 */
public class Material {
    private Integer oid;//订单id
    private Integer process;//订单当前流程
    private Integer mid;//原料id（对应仓库id）
    private Integer predict;//预计领取原料
    private Integer reality;//实际领取的原料
    private Integer consume;//已使用的原料
    private Integer scrap;//废料

    public Material(Integer oid, Integer process, Integer mid, Integer predict, Integer reality, Integer consume, Integer scrap) {
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

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getPredict() {
        return predict;
    }

    public void setPredict(Integer predict) {
        this.predict = predict;
    }

    public Integer getReality() {
        return reality;
    }

    public void setReality(Integer reality) {
        this.reality = reality;
    }

    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    public Integer getScrap() {
        return scrap;
    }

    public void setScrap(Integer scrap) {
        this.scrap = scrap;
    }

    @Override
    public String toString() {
        return "Material{" +
                "oid=" + oid +
                ", process=" + process +
                ", mid=" + mid +
                ", predict=" + predict +
                ", reality=" + reality +
                ", consume=" + consume +
                ", scrap=" + scrap +
                '}';
    }
}
