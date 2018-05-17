package po;

/**
 * �ʼ챨��
 */
public class QualityReport {
    private int id;//�ʼ쵥��
    private int oid;//����id
    private String declare;//�ύ����
    private String date;//ʱ��
    private int sample;//��������
    private int state;//�ʼ�״̬
    private int result;//�ʼ���
    private int scrap;//���ϸ�����
    private String explain;

    public QualityReport(int id, int oid, String declare, String date, int sample, int state, int result, int scrap,String explain) {
        this.id = id;
        this.oid = oid;
        this.declare = declare;
        this.date = date;
        this.sample = sample;
        this.state = state;
        this.result = result;
        this.scrap = scrap;
        this.explain=explain;
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

    public String getDeclare() {
        return declare;
    }

    public void setDeclare(String declare) {
        this.declare = declare;
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

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
