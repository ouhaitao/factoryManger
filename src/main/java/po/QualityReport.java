package po;

/**
 * �ʼ챨��
 */
public class QualityReport {
    private int id;//�ʼ쵥��
    private int oid;//����id
    private String submit;//�ύ����
    private String date;//ʱ��
    private int sample;//��������
    private int state;//�ʼ�״̬
    private int result;//�ʼ���
    private int scrap;//���ϸ�����
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
