package com.ciscospark;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.nimbusds.jose.jwk.JWK;

import java.text.SimpleDateFormat;

public class KmsJwk {

    private static final String RFC3339_DATE_TIME = "rfc3339-date-time";
    private static final SimpleDateFormat rfc3339DateTimeFormat = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'");
    private static ObjectMapper mapper;
    private String alg;
    private String crv;
    private String d;
    private String dp;
    private String dq;
    private String e;
    private String k;
    private String kid;
    private String kty;
    private String n;
    private String oth;
    private String p;
    private String q;
    private String qi;
    private String use;
    private String x;
    private String y;

    public KmsJwk() {
    }

    private static ObjectMapper getMapper() {
        if (null == mapper) {
            mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            SimpleModule dateModule = new SimpleModule(RFC3339_DATE_TIME);
            dateModule.addSerializer(new DateSerializer(Boolean.valueOf(false), rfc3339DateTimeFormat));
            mapper.registerModule(dateModule);
        }
        return mapper;
    }

    public String getAlg() {
        return this.alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getKty() {
        return this.kty;
    }

    public void setKty(String kty) {
        this.kty = kty;
    }

    public String getUse() {
        return this.use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getKid() {
        return this.kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public String getCrv() {
        return this.crv;
    }

    public void setCrv(String crv) {
        this.crv = crv;
    }

    public String getX() {
        return this.x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return this.y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getD() {
        return this.d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getN() {
        return this.n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getE() {
        return this.e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getP() {
        return this.p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getQ() {
        return this.q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getDp() {
        return this.dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getDq() {
        return this.dq;
    }

    public void setDq(String dq) {
        this.dq = dq;
    }

    public String getQi() {
        return this.qi;
    }

    public void setQi(String qi) {
        this.qi = qi;
    }

    public String getOth() {
        return this.oth;
    }

    public void setOth(String oth) {
        this.oth = oth;
    }

    public String getK() {
        return this.k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public JWK toJWK() throws Exception {
        return JWK.parse(getMapper().writeValueAsString(this));
    }
}
