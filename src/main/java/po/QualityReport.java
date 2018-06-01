package po;

/**
 * 质检报告
 */
public class QualityReport {
    private int id;//质检单号
    private int oid;//订单id
    private String submit;//提交部门
    private String date;//时间
    private int sample;//抽样数量
    private int state;//质检状态
    private int result;//质检结果
    private int scrap;//不合格数量
    private String info;

    public QualityReport(int id, int oid, String submit, String date, int sample, int state, int result, int scrap,String info) {
        this.id = id;
        this.oid = oid;
        this.submit = submit;
        this.date = date;
        this.sample = sample;
        this.state = state;
        this.result = result;
        this.scrap = scrap;
        this.info=info;
    }

    public QualityReport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getsubmit() {
        return submit;
    }

    public void setsubmit(String submit) {
        this.submit = submit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSample() {
        return sample;
    }

    public void setSample(int sample) {
        this.sample = sample;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getScrap() {
        return scrap;
    }

    public void setScrap(int scrap) {
        this.scrap = scrap;
    }

    public String getinfo() {
        return info;
    }

    public void setinfo(String info) {
        this.info = info;
    }
}
