package info.smartkit.shiny.guide.vo;

import com.blogspot.na5cent.exom.annotation.Column;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.javacodegeeks.drools.model.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangboz on 23/02/2017.
 */
@Entity
public class ItemDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getNjzd() {
        return njzd;
    }

    public void setNjzd(String njzd) {
        this.njzd = njzd;
    }

    public String getBlzd() {
        return blzd;
    }

    public void setBlzd(String blzd) {
        this.blzd = blzd;
    }

    public String getZzzd() {
        return zzzd;
    }

    public void setZzzd(String zzzd) {
        this.zzzd = zzzd;
    }

    @Column(name = "内镜诊断") //must same excel header (first row)
    private String njzd;

    @Column(name = "病理诊断") //must same excel header (first row)
    private String blzd;

    public ItemDetail(String njzd, String blzd, String zzzd, String houbao, String funi, String runzao, String botai, String pangshou, String chihen, String dianci, String liewen, String yuban, String taizhi, String shexing, String shese, String taise, String jieguo, String rgbR, String rgbG, String rgbB, String hsvH, String hsvS, String hsvV, String labelL, String labelA, String labelB, String q1_2, String q1_3r, String q1_3y, String q2_1) {
        this.njzd = njzd;
        this.blzd = blzd;
        this.zzzd = zzzd;
        this.houbao = houbao;
        this.funi = funi;
        this.runzao = runzao;
        this.botai = botai;
        this.pangshou = pangshou;
        this.chihen = chihen;
        this.dianci = dianci;
        this.liewen = liewen;
        this.yuban = yuban;
        this.taizhi = taizhi;
        this.shexing = shexing;
        this.shese = shese;
        this.taise = taise;
        this.jieguo = jieguo;
        this.rgbR = rgbR;
        this.rgbG = rgbG;
        this.rgbB = rgbB;
        this.hsvH = hsvH;
        this.hsvS = hsvS;
        this.hsvV = hsvV;
        this.labelL = labelL;
        this.labelA = labelA;
        this.labelB = labelB;
        this.q1_2 = q1_2;
        this.q1_3r = q1_3r;
        this.q1_3y = q1_3y;
        this.q2_1 = q2_1;
    }

    @Column(name = "最终诊断") //must same excel header (first row)
    private String zzzd;

    @Column(name = "厚薄") //must same excel header (first row)
    private String houbao;
    @Column(name = "腐腻")
    private String funi;
    @Column(name = "润燥")
    private String runzao;
    @Column(name = "剥苔")
    private String botai;
    @Column(name = "胖瘦")
    private String pangshou;
    @Column(name = "齿痕")
    private String chihen;
    @Column(name = "点刺")
    private String dianci;
    @Column(name = "裂纹")
    private String liewen;
    @Column(name = "瘀斑")
    private String yuban;
    @Column(name = "苔质")
    private String taizhi;
    @Column(name = "舌形")
    private String shexing;
    @Column(name = "整体舌色")
    private String shese;
    @Column(name = "整体苔色")
    private String taise;
    @Column(name = "结果")
    private String jieguo;
    @Column(name = "RGB_R")
    private String rgbR;
    @Column(name = "RGB_R")
    private String rgbG;
    @Column(name = "RGB_B")
    private String rgbB;
    @Column(name = "HSV_H")
    private String hsvH;
    @Column(name = "HSV_S")
    private String hsvS;
    @Column(name = "HSV_V")
    private String hsvV;
    @Column(name = "Label_L")
    private String labelL;
    @Column(name = "Label_A")
    private String labelA;
    @Column(name = "Label_B")
    private String labelB;
    //
    @Column(name = "q1_2")
    private String q1_2;
    @Column(name = "q1_3r")
    private String q1_3r;
    @Column(name = "q1_3y")
    private String q1_3y;
    @Column(name = "q2_1")
    private String q2_1;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    //convert to products
    private List<Product> products;

    @Override
    public String toString() {
        return "ItemDetail{" +
                "id=" + id +
                ", njzd='" + njzd + '\'' +
                ", blzd='" + blzd + '\'' +
                ", zzzd='" + zzzd + '\'' +
                ", houbao='" + houbao + '\'' +
                ", funi='" + funi + '\'' +
                ", runzao='" + runzao + '\'' +
                ", botai='" + botai + '\'' +
                ", pangshou='" + pangshou + '\'' +
                ", chihen='" + chihen + '\'' +
                ", dianci='" + dianci + '\'' +
                ", liewen='" + liewen + '\'' +
                ", yuban='" + yuban + '\'' +
                ", taizhi='" + taizhi + '\'' +
                ", shexing='" + shexing + '\'' +
                ", shese='" + shese + '\'' +
                ", taise='" + taise + '\'' +
                ", jieguo='" + jieguo + '\'' +
                ", rgbR='" + rgbR + '\'' +
                ", rgbG='" + rgbG + '\'' +
                ", rgbB='" + rgbB + '\'' +
                ", hsvH='" + hsvH + '\'' +
                ", hsvS='" + hsvS + '\'' +
                ", hsvV='" + hsvV + '\'' +
                ", labelL='" + labelL + '\'' +
                ", labelA='" + labelA + '\'' +
                ", labelB='" + labelB + '\'' +
                ", q1_2='" + q1_2 + '\'' +
                ", q1_3r='" + q1_3r + '\'' +
                ", q1_3y='" + q1_3y + '\'' +
                ", q2_1='" + q2_1 + '\'' +
                ", products=" + products +
                '}';
    }

    public ItemDetail() {

    }

    public long getId() {
        return id;
    }

    public String getQ1_2() {
        return q1_2;
    }

    public void setQ1_2(String q1_2) {
        this.q1_2 = q1_2;
    }

    public String getQ1_3r() {
        return q1_3r;
    }

    public void setQ1_3r(String q1_3r) {
        this.q1_3r = q1_3r;
    }

    public String getQ1_3y() {
        return q1_3y;
    }

    public void setQ1_3y(String q1_3y) {
        this.q1_3y = q1_3y;
    }

    public String getQ2_1() {
        return q2_1;
    }

    public void setQ2_1(String q2_1) {
        this.q2_1 = q2_1;
    }

    public String getLabelL() {
        return labelL;
    }

    public void setLabelL(String labelL) {
        this.labelL = labelL;
    }

    public String getLabelA() {
        return labelA;
    }

    public void setLabelA(String labelA) {
        this.labelA = labelA;
    }

    public String getLabelB() {
        return labelB;
    }

    public void setLabelB(String labelB) {
        this.labelB = labelB;
    }

    public String getHoubao() {
        return houbao;
    }

    public void setHoubao(String houbao) {
        this.houbao = houbao;
    }

    public String getFuni() {
        return funi;
    }

    public void setFuni(String funi) {
        this.funi = funi;
    }

    public String getRunzao() {
        return runzao;
    }

    public void setRunzao(String runzao) {
        this.runzao = runzao;
    }

    public String getBotai() {
        return botai;
    }

    public void setBotai(String botai) {
        this.botai = botai;
    }

    public String getPangshou() {
        return pangshou;
    }

    public void setPangshou(String pangshou) {
        this.pangshou = pangshou;
    }

    public String getChihen() {
        return chihen;
    }

    public void setChihen(String chihen) {
        this.chihen = chihen;
    }

    public String getDianci() {
        return dianci;
    }

    public void setDianci(String dianci) {
        this.dianci = dianci;
    }

    public String getLiewen() {
        return liewen;
    }

    public void setLiewen(String liewen) {
        this.liewen = liewen;
    }

    public String getYuban() {
        return yuban;
    }

    public void setYuban(String yuban) {
        this.yuban = yuban;
    }

    public String getTaizhi() {
        return taizhi;
    }

    public void setTaizhi(String taizhi) {
        this.taizhi = taizhi;
    }

    public String getShexing() {
        return shexing;
    }

    public void setShexing(String shexing) {
        this.shexing = shexing;
    }

    public String getShese() {
        return shese;
    }

    public void setShese(String shese) {
        this.shese = shese;
    }

    public String getTaise() {
        return taise;
    }

    public void setTaise(String taise) {
        this.taise = taise;
    }

    public String getJieguo() {
        return jieguo;
    }

    public void setJieguo(String jieguo) {
        this.jieguo = jieguo;
    }

    public String getRgbR() {
        return rgbR;
    }

    public void setRgbR(String rgbR) {
        this.rgbR = rgbR;
    }

    public String getRgbG() {
        return rgbG;
    }

    public void setRgbG(String rgbG) {
        this.rgbG = rgbG;
    }

    public String getRgbB() {
        return rgbB;
    }

    public void setRgbB(String rgbB) {
        this.rgbB = rgbB;
    }

    public String getHsvH() {
        return hsvH;
    }

    public void setHsvH(String hsvH) {
        this.hsvH = hsvH;
    }

    public String getHsvS() {
        return hsvS;
    }

    public void setHsvS(String hsvS) {
        this.hsvS = hsvS;
    }

    public String getHsvV() {
        return hsvV;
    }

    public void setHsvV(String hsvV) {
        this.hsvV = hsvV;
    }

    public List<Product> getProducts(){
        List<Product> products = new ArrayList<Product>();
//        products.add(new Product(this.getBotai(),1));
//        products.add(new Product(this.getChihen(),1));
//        products.add(new Product(this.getDianci(),1));
//        products.add(new Product(this.getFuni(),1));
//
//        products.add(new Product(this.getHoubao(),1));
//        products.add(new Product(this.getJieguo(),1));
//        products.add(new Product(this.getPangshou(),1));
//        products.add(new Product(this.getRunzao(),1));
//
//        products.add(new Product(this.getShese(),1));
//        products.add(new Product(this.getShexing(),1));
//
//        products.add(new Product(this.getTaise(),1));
//        products.add(new Product(this.getTaizhi(),1));
//
//        products.add(new Product(this.getYuban(),1));
//
//        products.add(new Product(this.getLabelA(),1));
//        products.add(new Product(this.getLabelB(),1));
//        products.add(new Product(this.getLabelL(),1));
//
//        products.add(new Product(this.getHsvH(),1));
//        products.add(new Product(this.getHsvS(),1));
//        products.add(new Product(this.getHsvV(),1));
//        products.add(new Product(this.getRgbB(),1));
//        products.add(new Product(this.getRgbB(),1));
//        products.add(new Product(this.getRgbB(),1));

        products.add(new Product(this.getJieguo(),1));
        products.add(new Product(this.getNjzd(),35));
        products.add(new Product(this.getBlzd(),65));
        products.add(new Product(this.getZzzd(),85));
        return products;
    }
}
