
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Language">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="SQ"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="HY"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AY"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="EU"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="ZH"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="EO"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="FY"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="KA"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="EL"/>
 *     &lt;enumeration value="KL"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="HE"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IK"/>
 *     &lt;enumeration value="IU"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="JA"/>
 *     &lt;enumeration value="JW"/>
 *     &lt;enumeration value="KN"/>
 *     &lt;enumeration value="KS"/>
 *     &lt;enumeration value="KK"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="RN"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="KU"/>
 *     &lt;enumeration value="LO"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LN"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="FA"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="QU"/>
 *     &lt;enumeration value="RM"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TA"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="TE"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="TI"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="UR"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VO"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="WO"/>
 *     &lt;enumeration value="XH"/>
 *     &lt;enumeration value="YI"/>
 *     &lt;enumeration value="YO"/>
 *     &lt;enumeration value="ZA"/>
 *     &lt;enumeration value="ZU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Language", namespace = "http://www.creditsafe.com/globaldata/datatypes")
@XmlEnum
public enum Language {

    OM,
    AB,
    AA,
    AF,
    SQ,
    AM,
    AR,
    HY,
    AS,
    AY,
    AZ,
    BA,
    EU,
    BN,
    DZ,
    BH,
    BI,
    BR,
    BG,
    MY,
    BE,
    KM,
    CA,
    ZH,
    CO,
    HR,
    CS,
    DA,
    NL,
    EN,
    EO,
    ET,
    FO,
    FJ,
    FI,
    FR,
    FY,
    GL,
    KA,
    DE,
    EL,
    KL,
    GN,
    GU,
    HA,
    HE,
    HI,
    HU,
    IS,
    ID,
    IA,
    IE,
    IK,
    IU,
    GA,
    IT,
    JA,
    JW,
    KN,
    KS,
    KK,
    RW,
    KY,
    RN,
    KO,
    KU,
    LO,
    LA,
    LV,
    LN,
    LT,
    MK,
    MG,
    MS,
    ML,
    MT,
    MI,
    MR,
    MO,
    MN,
    NA,
    NE,
    NO,
    OC,
    OR,
    PS,
    FA,
    PL,
    PT,
    PA,
    QU,
    RM,
    RO,
    RU,
    SM,
    SG,
    SA,
    GD,
    SR,
    SH,
    ST,
    TN,
    SN,
    SD,
    SI,
    SS,
    SK,
    SL,
    SO,
    ES,
    SU,
    SW,
    SV,
    TL,
    TG,
    TA,
    TT,
    TE,
    TH,
    BO,
    TI,
    TO,
    TS,
    TR,
    TK,
    TW,
    UG,
    UK,
    UR,
    UZ,
    VI,
    VO,
    CY,
    WO,
    XH,
    YI,
    YO,
    ZA,
    ZU;

    public String value() {
        return name();
    }

    public static Language fromValue(String v) {
        return valueOf(v);
    }

}
