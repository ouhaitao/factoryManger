package po;

/**
 * ԭ���嵥
 * ��¼ÿ�������������̵�ԭ����ȡ��ʹ�����
 */
public class Material {
    private int oid;//����id
    private int process;//������ǰ����
    private int mid;//ԭ��id����Ӧ�ֿ�id��
    private int predict;//Ԥ����ȡԭ��
    private int reality;//ʵ����ȡ��ԭ��
    private int consume;//��ʹ�õ�ԭ��
    private int scrap;//����

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
