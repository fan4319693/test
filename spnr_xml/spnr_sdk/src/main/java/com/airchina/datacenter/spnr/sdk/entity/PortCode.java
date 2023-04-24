//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PortCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PortCode">
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to8">
 *     &lt;enumeration value="ABER"/>
 *     &lt;enumeration value="AJAC"/>
 *     &lt;enumeration value="ALEX"/>
 *     &lt;enumeration value="ALGE"/>
 *     &lt;enumeration value="ALGI"/>
 *     &lt;enumeration value="ALIC"/>
 *     &lt;enumeration value="ALKE"/>
 *     &lt;enumeration value="ALME"/>
 *     &lt;enumeration value="ALON"/>
 *     &lt;enumeration value="AMOR"/>
 *     &lt;enumeration value="AMRU"/>
 *     &lt;enumeration value="AMST"/>
 *     &lt;enumeration value="ANAF"/>
 *     &lt;enumeration value="ANCI"/>
 *     &lt;enumeration value="ANCO"/>
 *     &lt;enumeration value="ANDE"/>
 *     &lt;enumeration value="ANDR"/>
 *     &lt;enumeration value="ANNA"/>
 *     &lt;enumeration value="ARBA"/>
 *     &lt;enumeration value="ARDR"/>
 *     &lt;enumeration value="ARGO"/>
 *     &lt;enumeration value="ARRE"/>
 *     &lt;enumeration value="ASSM"/>
 *     &lt;enumeration value="ASTY"/>
 *     &lt;enumeration value="BACH"/>
 *     &lt;enumeration value="BALY"/>
 *     &lt;enumeration value="BAR"/>
 *     &lt;enumeration value="BARC"/>
 *     &lt;enumeration value="BARI"/>
 *     &lt;enumeration value="BAST"/>
 *     &lt;enumeration value="BEJA"/>
 *     &lt;enumeration value="BELF"/>
 *     &lt;enumeration value="BELH"/>
 *     &lt;enumeration value="BENI"/>
 *     &lt;enumeration value="BERG"/>
 *     &lt;enumeration value="BILB"/>
 *     &lt;enumeration value="BING"/>
 *     &lt;enumeration value="BIZE"/>
 *     &lt;enumeration value="BOJD"/>
 *     &lt;enumeration value="BONI"/>
 *     &lt;enumeration value="BONN"/>
 *     &lt;enumeration value="BOPP"/>
 *     &lt;enumeration value="BOUL"/>
 *     &lt;enumeration value="BOZA"/>
 *     &lt;enumeration value="BRAT"/>
 *     &lt;enumeration value="BRAU"/>
 *     &lt;enumeration value="BREI"/>
 *     &lt;enumeration value="BRIN"/>
 *     &lt;enumeration value="BROD"/>
 *     &lt;enumeration value="BUDA"/>
 *     &lt;enumeration value="BURG"/>
 *     &lt;enumeration value="CADI"/>
 *     &lt;enumeration value="CAEN"/>
 *     &lt;enumeration value="CAGL"/>
 *     &lt;enumeration value="CAIR"/>
 *     &lt;enumeration value="CALA"/>
 *     &lt;enumeration value="CALL"/>
 *     &lt;enumeration value="CALV"/>
 *     &lt;enumeration value="CAMP"/>
 *     &lt;enumeration value="CART"/>
 *     &lt;enumeration value="CATA"/>
 *     &lt;enumeration value="CESM"/>
 *     &lt;enumeration value="CEUT"/>
 *     &lt;enumeration value="CHAL"/>
 *     &lt;enumeration value="CHAN"/>
 *     &lt;enumeration value="CHER"/>
 *     &lt;enumeration value="CHIO"/>
 *     &lt;enumeration value="CIVI"/>
 *     &lt;enumeration value="COCH"/>
 *     &lt;enumeration value="CORK"/>
 *     &lt;enumeration value="CRIS"/>
 *     &lt;enumeration value="CUXH"/>
 *     &lt;enumeration value="DENI"/>
 *     &lt;enumeration value="DGSA"/>
 *     &lt;enumeration value="DIEL"/>
 *     &lt;enumeration value="DIEP"/>
 *     &lt;enumeration value="DIPE"/>
 *     &lt;enumeration value="DIPL"/>
 *     &lt;enumeration value="DONO"/>
 *     &lt;enumeration value="DOVE"/>
 *     &lt;enumeration value="DOVL"/>
 *     &lt;enumeration value="DOVW"/>
 *     &lt;enumeration value="DRAG"/>
 *     &lt;enumeration value="DUBL"/>
 *     &lt;enumeration value="DUBN"/>
 *     &lt;enumeration value="DUBR"/>
 *     &lt;enumeration value="DUBS"/>
 *     &lt;enumeration value="DUGI"/>
 *     &lt;enumeration value="DUNH"/>
 *     &lt;enumeration value="DUNK"/>
 *     &lt;enumeration value="DUNL"/>
 *     &lt;enumeration value="DUNY"/>
 *     &lt;enumeration value="DURR"/>
 *     &lt;enumeration value="EGER"/>
 *     &lt;enumeration value="EGIA"/>
 *     &lt;enumeration value="ELBA"/>
 *     &lt;enumeration value="ELTV"/>
 *     &lt;enumeration value="ESBJ"/>
 *     &lt;enumeration value="EVDI"/>
 *     &lt;enumeration value="FANO"/>
 *     &lt;enumeration value="FILL"/>
 *     &lt;enumeration value="FISH"/>
 *     &lt;enumeration value="FISL"/>
 *     &lt;enumeration value="FIUM"/>
 *     &lt;enumeration value="FLEE"/>
 *     &lt;enumeration value="FOLE"/>
 *     &lt;enumeration value="FOLK"/>
 *     &lt;enumeration value="FORM"/>
 *     &lt;enumeration value="FOUR"/>
 *     &lt;enumeration value="FRDH"/>
 *     &lt;enumeration value="FRDS"/>
 *     &lt;enumeration value="FYNS"/>
 *     &lt;enumeration value="GAND"/>
 *     &lt;enumeration value="GDYN"/>
 *     &lt;enumeration value="GEDS"/>
 *     &lt;enumeration value="GENU"/>
 *     &lt;enumeration value="GODE"/>
 *     &lt;enumeration value="GOES"/>
 *     &lt;enumeration value="GOET"/>
 *     &lt;enumeration value="GOLF"/>
 *     &lt;enumeration value="GOME"/>
 *     &lt;enumeration value="GOTS"/>
 *     &lt;enumeration value="GRAN"/>
 *     &lt;enumeration value="GREN"/>
 *     &lt;enumeration value="GRJI"/>
 *     &lt;enumeration value="GUER"/>
 *     &lt;enumeration value="HALM"/>
 *     &lt;enumeration value="HALS"/>
 *     &lt;enumeration value="HAMB"/>
 *     &lt;enumeration value="HANK"/>
 *     &lt;enumeration value="HANS"/>
 *     &lt;enumeration value="HARH"/>
 *     &lt;enumeration value="HARW"/>
 *     &lt;enumeration value="HAUG"/>
 *     &lt;enumeration value="HAVN"/>
 *     &lt;enumeration value="HEBO"/>
 *     &lt;enumeration value="HEKI"/>
 *     &lt;enumeration value="HELG"/>
 *     &lt;enumeration value="HELI"/>
 *     &lt;enumeration value="HEOR"/>
 *     &lt;enumeration value="HERA"/>
 *     &lt;enumeration value="HEYS"/>
 *     &lt;enumeration value="HIR"/>
 *     &lt;enumeration value="HIRT"/>
 *     &lt;enumeration value="HOEH"/>
 *     &lt;enumeration value="HOEK"/>
 *     &lt;enumeration value="HOEN"/>
 *     &lt;enumeration value="HOLH"/>
 *     &lt;enumeration value="HOLL"/>
 *     &lt;enumeration value="HOLS"/>
 *     &lt;enumeration value="HOLY"/>
 *     &lt;enumeration value="HONN"/>
 *     &lt;enumeration value="HULL"/>
 *     &lt;enumeration value="HVAR"/>
 *     &lt;enumeration value="IBIZ"/>
 *     &lt;enumeration value="IGOU"/>
 *     &lt;enumeration value="ILER"/>
 *     &lt;enumeration value="IOS"/>
 *     &lt;enumeration value="IRAK"/>
 *     &lt;enumeration value="ITHA"/>
 *     &lt;enumeration value="JERS"/>
 *     &lt;enumeration value="KALO"/>
 *     &lt;enumeration value="KALY"/>
 *     &lt;enumeration value="KAMP"/>
 *     &lt;enumeration value="KAPP"/>
 *     &lt;enumeration value="KARL"/>
 *     &lt;enumeration value="KARP"/>
 *     &lt;enumeration value="KASS"/>
 *     &lt;enumeration value="KATA"/>
 *     &lt;enumeration value="KAUB"/>
 *     &lt;enumeration value="KEPH"/>
 *     &lt;enumeration value="KEL"/>
 *     &lt;enumeration value="KIEL"/>
 *     &lt;enumeration value="KILL"/>
 *     &lt;enumeration value="KIMO"/>
 *     &lt;enumeration value="KIRI"/>
 *     &lt;enumeration value="KLAI"/>
 *     &lt;enumeration value="KNUD"/>
 *     &lt;enumeration value="KOBE"/>
 *     &lt;enumeration value="KOBL"/>
 *     &lt;enumeration value="KOEL"/>
 *     &lt;enumeration value="KOEN"/>
 *     &lt;enumeration value="KOPE"/>
 *     &lt;enumeration value="KORC"/>
 *     &lt;enumeration value="KORF"/>
 *     &lt;enumeration value="KOS"/>
 *     &lt;enumeration value="KOUF"/>
 *     &lt;enumeration value="KRS"/>
 *     &lt;enumeration value="KRIS"/>
 *     &lt;enumeration value="KUSA"/>
 *     &lt;enumeration value="KYTH"/>
 *     &lt;enumeration value="LANG"/>
 *     &lt;enumeration value="LAPA"/>
 *     &lt;enumeration value="LARN"/>
 *     &lt;enumeration value="LAR"/>
 *     &lt;enumeration value="LARV"/>
 *     &lt;enumeration value="LASP"/>
 *     &lt;enumeration value="LEHA"/>
 *     &lt;enumeration value="LERO"/>
 *     &lt;enumeration value="LERW"/>
 *     &lt;enumeration value="LEVK"/>
 *     &lt;enumeration value="LIMH"/>
 *     &lt;enumeration value="LINR"/>
 *     &lt;enumeration value="LIST"/>
 *     &lt;enumeration value="LIVE"/>
 *     &lt;enumeration value="LIVO"/>
 *     &lt;enumeration value="LORC"/>
 *     &lt;enumeration value="LUEB"/>
 *     &lt;enumeration value="MAHO"/>
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="MALA"/>
 *     &lt;enumeration value="MALI"/>
 *     &lt;enumeration value="MALT"/>
 *     &lt;enumeration value="MARI"/>
 *     &lt;enumeration value="MARS"/>
 *     &lt;enumeration value="MELI"/>
 *     &lt;enumeration value="MILO"/>
 *     &lt;enumeration value="MORR"/>
 *     &lt;enumeration value="MOSK"/>
 *     &lt;enumeration value="MOSS"/>
 *     &lt;enumeration value="MOSW"/>
 *     &lt;enumeration value="MUKR"/>
 *     &lt;enumeration value="MYKO"/>
 *     &lt;enumeration value="MYTI"/>
 *     &lt;enumeration value="NAAN"/>
 *     &lt;enumeration value="NADO"/>
 *     &lt;enumeration value="NAPL"/>
 *     &lt;enumeration value="NAXO"/>
 *     &lt;enumeration value="NEAP"/>
 *     &lt;enumeration value="NEUW"/>
 *     &lt;enumeration value="NEWC"/>
 *     &lt;enumeration value="NEWH"/>
 *     &lt;enumeration value="NEWL"/>
 *     &lt;enumeration value="NEWN"/>
 *     &lt;enumeration value="NIEH"/>
 *     &lt;enumeration value="NIEL"/>
 *     &lt;enumeration value="NIZZ"/>
 *     &lt;enumeration value="OBLA"/>
 *     &lt;enumeration value="OBWE"/>
 *     &lt;enumeration value="OLBI"/>
 *     &lt;enumeration value="OLIB"/>
 *     &lt;enumeration value="OOST"/>
 *     &lt;enumeration value="ORAN"/>
 *     &lt;enumeration value="OSL"/>
 *     &lt;enumeration value="OSLO"/>
 *     &lt;enumeration value="PALE"/>
 *     &lt;enumeration value="PALM"/>
 *     &lt;enumeration value="PARO"/>
 *     &lt;enumeration value="PATM"/>
 *     &lt;enumeration value="PATR"/>
 *     &lt;enumeration value="PAXI"/>
 *     &lt;enumeration value="PEMB"/>
 *     &lt;enumeration value="PESC"/>
 *     &lt;enumeration value="PIOM"/>
 *     &lt;enumeration value="PIRA"/>
 *     &lt;enumeration value="PLYM"/>
 *     &lt;enumeration value="POOL"/>
 *     &lt;enumeration value="PORB"/>
 *     &lt;enumeration value="PORO"/>
 *     &lt;enumeration value="PORS"/>
 *     &lt;enumeration value="PORT"/>
 *     &lt;enumeration value="PORV"/>
 *     &lt;enumeration value="PORZ"/>
 *     &lt;enumeration value="PREM"/>
 *     &lt;enumeration value="PRIM"/>
 *     &lt;enumeration value="PROP"/>
 *     &lt;enumeration value="PTOR"/>
 *     &lt;enumeration value="PUER"/>
 *     &lt;enumeration value="PUTT"/>
 *     &lt;enumeration value="RAB"/>
 *     &lt;enumeration value="RAFI"/>
 *     &lt;enumeration value="RAVE"/>
 *     &lt;enumeration value="REMA"/>
 *     &lt;enumeration value="RETH"/>
 *     &lt;enumeration value="RHEN"/>
 *     &lt;enumeration value="RHOD"/>
 *     &lt;enumeration value="RIJE"/>
 *     &lt;enumeration value="ROED"/>
 *     &lt;enumeration value="ROEN"/>
 *     &lt;enumeration value="ROLL"/>
 *     &lt;enumeration value="ROSC"/>
 *     &lt;enumeration value="ROSL"/>
 *     &lt;enumeration value="ROSS"/>
 *     &lt;enumeration value="ROST"/>
 *     &lt;enumeration value="ROTT"/>
 *     &lt;enumeration value="RUED"/>
 *     &lt;enumeration value="RUEG"/>
 *     &lt;enumeration value="SALZ"/>
 *     &lt;enumeration value="SAMI"/>
 *     &lt;enumeration value="SAMO"/>
 *     &lt;enumeration value="SANA"/>
 *     &lt;enumeration value="SAD"/>
 *     &lt;enumeration value="SAND"/>
 *     &lt;enumeration value="SANT"/>
 *     &lt;enumeration value="SARK"/>
 *     &lt;enumeration value="SASS"/>
 *     &lt;enumeration value="SATA"/>
 *     &lt;enumeration value="SAVO"/>
 *     &lt;enumeration value="SCPA"/>
 *     &lt;enumeration value="SCRA"/>
 *     &lt;enumeration value="SERI"/>
 *     &lt;enumeration value="SETE"/>
 *     &lt;enumeration value="SEVI"/>
 *     &lt;enumeration value="SEYD"/>
 *     &lt;enumeration value="SFAX"/>
 *     &lt;enumeration value="SHIN"/>
 *     &lt;enumeration value="SIBE"/>
 *     &lt;enumeration value="SIFN"/>
 *     &lt;enumeration value="SIKI"/>
 *     &lt;enumeration value="SILB"/>
 *     &lt;enumeration value="SIRO"/>
 *     &lt;enumeration value="SITI"/>
 *     &lt;enumeration value="SKAG"/>
 *     &lt;enumeration value="SKIA"/>
 *     &lt;enumeration value="SKIK"/>
 *     &lt;enumeration value="SKOP"/>
 *     &lt;enumeration value="SOBR"/>
 *     &lt;enumeration value="SODE"/>
 *     &lt;enumeration value="SOUS"/>
 *     &lt;enumeration value="SOUT"/>
 *     &lt;enumeration value="SPLI"/>
 *     &lt;enumeration value="SPOD"/>
 *     &lt;enumeration value="STAR"/>
 *     &lt;enumeration value="STAV"/>
 *     &lt;enumeration value="STET"/>
 *     &lt;enumeration value="STGH"/>
 *     &lt;enumeration value="STGR"/>
 *     &lt;enumeration value="STMA"/>
 *     &lt;enumeration value="STOC"/>
 *     &lt;enumeration value="STQP"/>
 *     &lt;enumeration value="STRA"/>
 *     &lt;enumeration value="STRH"/>
 *     &lt;enumeration value="SMD"/>
 *     &lt;enumeration value="STRM"/>
 *     &lt;enumeration value="STRN"/>
 *     &lt;enumeration value="STRO"/>
 *     &lt;enumeration value="STTE"/>
 *     &lt;enumeration value="SWIN"/>
 *     &lt;enumeration value="SYLT"/>
 *     &lt;enumeration value="SYMI"/>
 *     &lt;enumeration value="SYRO"/>
 *     &lt;enumeration value="TALL"/>
 *     &lt;enumeration value="TANG"/>
 *     &lt;enumeration value="TARS"/>
 *     &lt;enumeration value="TENE"/>
 *     &lt;enumeration value="TINO"/>
 *     &lt;enumeration value="TORS"/>
 *     &lt;enumeration value="TOUL"/>
 *     &lt;enumeration value="TRAP"/>
 *     &lt;enumeration value="TRAV"/>
 *     &lt;enumeration value="TREI"/>
 *     &lt;enumeration value="TREL"/>
 *     &lt;enumeration value="TRON"/>
 *     &lt;enumeration value="TRST"/>
 *     &lt;enumeration value="TUNI"/>
 *     &lt;enumeration value="TURK"/>
 *     &lt;enumeration value="UBLI"/>
 *     &lt;enumeration value="UMEA"/>
 *     &lt;enumeration value="UNKE"/>
 *     &lt;enumeration value="VAAS"/>
 *     &lt;enumeration value="VALE"/>
 *     &lt;enumeration value="VALV"/>
 *     &lt;enumeration value="VARB"/>
 *     &lt;enumeration value="VATH"/>
 *     &lt;enumeration value="VELA"/>
 *     &lt;enumeration value="VENE"/>
 *     &lt;enumeration value="VIS"/>
 *     &lt;enumeration value="VOLO"/>
 *     &lt;enumeration value="WARN"/>
 *     &lt;enumeration value="WEDE"/>
 *     &lt;enumeration value="WESS"/>
 *     &lt;enumeration value="WIEN"/>
 *     &lt;enumeration value="WIES"/>
 *     &lt;enumeration value="WINN"/>
 *     &lt;enumeration value="WISM"/>
 *     &lt;enumeration value="YSTA"/>
 *     &lt;enumeration value="ZADA"/>
 *     &lt;enumeration value="ZAKY"/>
 *     &lt;enumeration value="ZANT"/>
 *     &lt;enumeration value="ZEEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PortCode")
@XmlEnum
public enum PortCode {


    /**
     * Aberdeen
     * 
     */
    ABER,

    /**
     * Ajaccio
     * 
     */
    AJAC,

    /**
     * Alexandrie
     * 
     */
    ALEX,

    /**
     * Algeciras
     * 
     */
    ALGE,

    /**
     * Algiers
     * 
     */
    ALGI,

    /**
     * Alicante
     * 
     */
    ALIC,

    /**
     * Alken
     * 
     */
    ALKE,

    /**
     * Almeria
     * 
     */
    ALME,

    /**
     * Alonissos
     * 
     */
    ALON,

    /**
     * Amorgos
     * 
     */
    AMOR,

    /**
     * Amrum
     * 
     */
    AMRU,

    /**
     * Amsterdam (Ijmuiden)
     * 
     */
    AMST,

    /**
     * Anafi
     * 
     */
    ANAF,

    /**
     * Ancona Assigned by START for superfast ferries on special sailings but not used at present (vn 6.2).
     * 
     */
    ANCI,

    /**
     * Ancona
     * 
     */
    ANCO,

    /**
     * Andernach
     * 
     */
    ANDE,

    /**
     * Andros
     * 
     */
    ANDR,

    /**
     * Annaba
     * 
     */
    ANNA,

    /**
     * Arbatax
     * 
     */
    ARBA,

    /**
     * Ardrossan UNICORN - pre UN/LOCODES.
     * 
     */
    ARDR,

    /**
     * Argostoli
     * 
     */
    ARGO,

    /**
     * Arrecife
     * 
     */
    ARRE,

    /**
     * Assmannsh.
     * 
     */
    ASSM,

    /**
     * Astypalaia
     * 
     */
    ASTY,

    /**
     * Bacharach
     * 
     */
    BACH,

    /**
     * Ballycastle UNICORN - pre UN/LOCODES.
     * 
     */
    BALY,

    /**
     * Bar
     * 
     */
    BAR,

    /**
     * Barcelona
     * 
     */
    BARC,

    /**
     * Bari
     * 
     */
    BARI,

    /**
     * Bastia
     * 
     */
    BAST,

    /**
     * Bejaia
     * 
     */
    BEJA,

    /**
     * Belfast UNICORN - pre UN/LOCODES.
     * 
     */
    BELF,

    /**
     * Belfast UNICORN - pre UN/LOCODES.
     * 
     */
    BELH,

    /**
     * Benidorm
     * 
     */
    BENI,

    /**
     * Bergen
     * 
     */
    BERG,

    /**
     * Santurtce, Bilbao UNICORN - pre UN/LOCODES.
     * 
     */
    BILB,

    /**
     * Bingen
     * 
     */
    BING,

    /**
     * Bizerte
     * 
     */
    BIZE,

    /**
     * Bojden
     * 
     */
    BOJD,

    /**
     * Bonifacio
     * 
     */
    BONI,

    /**
     * Bonn
     * 
     */
    BONN,

    /**
     * Boppard
     * 
     */
    BOPP,

    /**
     * Boulogne sur Mer UNICORN - pre UN/LOCODES.
     * 
     */
    BOUL,

    /**
     * Bozava
     * 
     */
    BOZA,

    /**
     * Bratislava
     * 
     */
    BRAT,

    /**
     * Braubach
     * 
     */
    BRAU,

    /**
     * Bad Breisig
     * 
     */
    BREI,

    /**
     * Brindisi
     * 
     */
    BRIN,

    /**
     * Brodenbach
     * 
     */
    BROD,

    /**
     * Budapest
     * 
     */
    BUDA,

    /**
     * Burgstaaken
     * 
     */
    BURG,

    /**
     * Cadiz
     * 
     */
    CADI,

    /**
     * Caen, Ouistreham UNICORN - pre UN/LOCODES.
     * 
     */
    CAEN,

    /**
     * Cagliari
     * 
     */
    CAGL,

    /**
     * Cairnryan UNICORN - pre UN/LOCODES.
     * 
     */
    CAIR,

    /**
     * Calais UNICORN - pre UN/LOCODES.
     * 
     */
    CALA,

    /**
     * Calais UNICORN - pre UN/LOCODES.
     * 
     */
    CALL,

    /**
     * Calvi
     * 
     */
    CALV,

    /**
     * Campbeltown UNICORN - pre UN/LOCODES.
     * 
     */
    CAMP,

    /**
     * Carteret
     * 
     */
    CART,

    /**
     * Catania
     * 
     */
    CATA,

    /**
     * Cesme
     * 
     */
    CESM,

    /**
     * Ceuta
     * 
     */
    CEUT,

    /**
     * Chalki
     * 
     */
    CHAL,

    /**
     * Chania
     * 
     */
    CHAN,

    /**
     * Cherbourg UNICORN - pre UN/LOCODES.
     * 
     */
    CHER,

    /**
     * Chios
     * 
     */
    CHIO,

    /**
     * Civitavecchia
     * 
     */
    CIVI,

    /**
     * Cochem
     * 
     */
    COCH,

    /**
     * Cork UNICORN - pre UN/LOCODES.
     * 
     */
    CORK,

    /**
     * Los Cristia.
     * 
     */
    CRIS,

    /**
     * Cuxhaven
     * 
     */
    CUXH,

    /**
     * Denia
     * 
     */
    DENI,

    /**
     * Douglas
     * 
     */
    DGSA,

    /**
     * Dielette
     * 
     */
    DIEL,

    /**
     * Dieppe UNICORN - pre UN/LOCODES.
     * 
     */
    DIEP,

    /**
     * Dieppe UNICORN - pre UN/LOCODES.
     * 
     */
    DIPE,

    /**
     * Dieppe UNICORN - pre UN/LOCODES.
     * 
     */
    DIPL,

    /**
     * Donousa
     * 
     */
    DONO,

    /**
     * Dover, Eastern Docks UNICORN - pre UN/LOCODES.
     * 
     */
    DOVE,

    /**
     * Dover, Eastern Dock Fast Ferry UNICORN - pre UN/LOCODES.
     * 
     */
    DOVL,

    /**
     * Dover, Western Docks/Hoverport UNICORN - pre UN/LOCODES.
     * 
     */
    DOVW,

    /**
     * Dragoer
     * 
     */
    DRAG,

    /**
     * Dublin
     * 
     */
    DUBL,

    /**
     * Dublin UNICORN - pre UN/LOCODES. No longer used?
     * 
     */
    DUBN,

    /**
     * Dubrovnik
     * 
     */
    DUBR,

    /**
     * Dublin Swift
     * 
     */
    DUBS,

    /**
     * Dugi Otok
     * 
     */
    DUGI,

    /**
     * Dun Laoghaire (fast) UNICORN - pre UN/LOCODES.
     * 
     */
    DUNH,

    /**
     * Gravelines, Dunkerque Ouest UNICORN - pre UN/LOCODES.
     * 
     */
    DUNK,

    /**
     * Dun Laoghaire UNICORN - pre UN/LOCODES.
     * 
     */
    DUNL,

    /**
     * Dun Laoghaire
     * 
     */
    DUNY,

    /**
     * Durres
     * 
     */
    DURR,

    /**
     * Egersund
     * 
     */
    EGER,

    /**
     * Egiali
     * 
     */
    EGIA,

    /**
     * Ile D'elbe
     * 
     */
    ELBA,

    /**
     * Eltville
     * 
     */
    ELTV,

    /**
     * Esbjerg
     * 
     */
    ESBJ,

    /**
     * Evdilos
     * 
     */
    EVDI,

    /**
     * Fanoe
     * 
     */
    FANO,

    /**
     * Fishguard Lynx
     * 
     */
    FILL,

    /**
     * Fishguard UNICORN - pre UN/LOCODES.
     * 
     */
    FISH,

    /**
     * Fishguard UNICORN - pre UN/LOCODES.
     * 
     */
    FISL,

    /**
     * Fiumicino
     * 
     */
    FIUM,

    /**
     * Fleetwood UNICORN - pre UN/LOCODES.
     * 
     */
    FLEE,

    /**
     * Folegandros
     * 
     */
    FOLE,

    /**
     * Folkestone UNICORN - pre UN/LOCODES.
     * 
     */
    FOLK,

    /**
     * Formentera
     * 
     */
    FORM,

    /**
     * Fourni
     * 
     */
    FOUR,

    /**
     * Frederikshavn
     * 
     */
    FRDH,

    /**
     * Frederikshavn
     * 
     */
    FRDS,

    /**
     * Fynshav
     * 
     */
    FYNS,

    /**
     * Gandia
     * 
     */
    GAND,

    /**
     * Gdynia
     * 
     */
    GDYN,

    /**
     * Gedser
     * 
     */
    GEDS,

    /**
     * Genoa
     * 
     */
    GENU,

    /**
     * Bn.Bad Godesburg
     * 
     */
    GODE,

    /**
     * Goeteborg
     * 
     */
    GOES,

    /**
     * Gothenburg
     * 
     */
    GOET,

    /**
     * Golfo Aranci
     * 
     */
    GOLF,

    /**
     * Gomera
     * 
     */
    GOME,

    /**
     * Gothenburg (fast)
     * 
     */
    GOTS,

    /**
     * Granville
     * 
     */
    GRAN,

    /**
     * Grenaa
     * 
     */
    GREN,

    /**
     * Ikaria
     * 
     */
    GRJI,

    /**
     * Guernsey
     * 
     */
    GUER,

    /**
     * Halmstad
     * 
     */
    HALM,

    /**
     * Halsskov
     * 
     */
    HALS,

    /**
     * Hamburg
     * 
     */
    HAMB,

    /**
     * Hanko
     * 
     */
    HANK,

    /**
     * Hanstholm
     * 
     */
    HANS,

    /**
     * Harwich, Parkeston Quay UNICORN - pre UN/LOCODES.
     * 
     */
    HARH,

    /**
     * Harwich, Parkeston Quay UNICORN - pre UN/LOCODES.
     * 
     */
    HARW,

    /**
     * Haugesund
     * 
     */
    HAUG,

    /**
     * Havneby
     * 
     */
    HAVN,

    /**
     * Helsingborg
     * 
     */
    HEBO,

    /**
     * Helsinki
     * 
     */
    HEKI,

    /**
     * Helgoland
     * 
     */
    HELG,

    /**
     * Porto heli
     * 
     */
    HELI,

    /**
     * Helsingoer
     * 
     */
    HEOR,

    /**
     * Heraklion
     * 
     */
    HERA,

    /**
     * Heysham UNICORN - pre UN/LOCODES.
     * 
     */
    HEYS,

    /**
     * Hirtshals
     * 
     */
    HIR,

    /**
     * Hirtshals
     * 
     */
    HIRT,

    /**
     * Hoek van Holland UNICORN - pre UN/LOCODES.
     * 
     */
    HOEH,

    /**
     * Hoek van Holland UNICORN - pre UN/LOCODES.
     * 
     */
    HOEK,

    /**
     * B.Hoenningen
     * 
     */
    HOEN,

    /**
     * Holyhead UNICORN - pre UN/LOCODES.
     * 
     */
    HOLH,

    /**
     * Holyhead Lynx
     * 
     */
    HOLL,

    /**
     * Holyhead
     * 
     */
    HOLS,

    /**
     * Holyhead UNICORN - pre UN/LOCODES.
     * 
     */
    HOLY,

    /**
     * Bad Honnef
     * 
     */
    HONN,

    /**
     * Hull UNICORN - pre UN/LOCODES.
     * 
     */
    HULL,

    /**
     * Hvar
     * 
     */
    HVAR,

    /**
     * Ibiza
     * 
     */
    IBIZ,

    /**
     * Igoumenitsa
     * 
     */
    IGOU,

    /**
     * Ile Rousse
     * 
     */
    ILER,

    /**
     * Ios
     * 
     */
    IOS,

    /**
     * Heraklion
     * 
     */
    IRAK,

    /**
     * Ithaca
     * 
     */
    ITHA,

    /**
     * Jersey St.Helier
     * 
     */
    JERS,

    /**
     * Karlovasi
     * 
     */
    KALO,

    /**
     * Kalymnos
     * 
     */
    KALY,

    /**
     * Kamp-bornh.
     * 
     */
    KAMP,

    /**
     * Kapellskaer
     * 
     */
    KAPP,

    /**
     * Karlskrona
     * 
     */
    KARL,

    /**
     * Karpathos
     * 
     */
    KARP,

    /**
     * Kassos
     * 
     */
    KASS,

    /**
     * Katapola
     * 
     */
    KATA,

    /**
     * Kaub
     * 
     */
    KAUB,

    /**
     * Cefalonia
     * 
     */
    KEPH,

    /**
     * Kiel
     * 
     */
    KEL,

    /**
     * Kiel
     * 
     */
    KIEL,

    /**
     * Killini
     * 
     */
    KILL,

    /**
     * Kimolos
     * 
     */
    KIMO,

    /**
     * Kirikos
     * 
     */
    KIRI,

    /**
     * Klaipeda
     * 
     */
    KLAI,

    /**
     * Knudshoved
     * 
     */
    KNUD,

    /**
     * Kobern-gond.
     * 
     */
    KOBE,

    /**
     * Koblenz
     * 
     */
    KOBL,

    /**
     * Koeln
     * 
     */
    KOEL,

    /**
     * Koenigswint
     * 
     */
    KOEN,

    /**
     * Copenhagen
     * 
     */
    KOPE,

    /**
     * Korcula
     * 
     */
    KORC,

    /**
     * Corfu
     * 
     */
    KORF,

    /**
     * Kos
     * 
     */
    KOS,

    /**
     * Koufonisia
     * 
     */
    KOUF,

    /**
     * Kristiansand
     * 
     */
    KRS,

    /**
     * Kristiansand
     * 
     */
    KRIS,

    /**
     * Kusadasi
     * 
     */
    KUSA,

    /**
     * Kythnos
     * 
     */
    KYTH,

    /**
     * Langnaes
     * 
     */
    LANG,

    /**
     * Las Palmas
     * 
     */
    LAPA,

    /**
     * Larne UNICORN - pre UN/LOCODES.
     * 
     */
    LARN,

    /**
     * Larvik
     * 
     */
    LAR,

    /**
     * Larvik
     * 
     */
    LARV,

    /**
     * La Spezia Corsica ferries port
     * 
     */
    LASP,

    /**
     * Le Havre
     * 
     */
    LEHA,

    /**
     * Leros
     * 
     */
    LERO,

    /**
     * Lerwick
     * 
     */
    LERW,

    /**
     * Lefkas
     * 
     */
    LEVK,

    /**
     * Limhamn
     * 
     */
    LIMH,

    /**
     * Linz/rhein
     * 
     */
    LINR,

    /**
     * List
     * 
     */
    LIST,

    /**
     * Liverpool
     * 
     */
    LIVE,

    /**
     * Livorno
     * 
     */
    LIVO,

    /**
     * Lorch
     * 
     */
    LORC,

    /**
     * Luebeck
     * 
     */
    LUEB,

    /**
     * Mahon
     * 
     */
    MAHO,

    /**
     * Mainz
     * 
     */
    MAIN,

    /**
     * Malaga
     * 
     */
    MALA,

    /**
     * Mali Losinj
     * 
     */
    MALI,

    /**
     * Malta
     * 
     */
    MALT,

    /**
     * Mariehamn
     * 
     */
    MARI,

    /**
     * Marseille
     * 
     */
    MARS,

    /**
     * Melilla
     * 
     */
    MELI,

    /**
     * Milos
     * 
     */
    MILO,

    /**
     * Morro Jable
     * 
     */
    MORR,

    /**
     * Moselkern
     * 
     */
    MOSK,

    /**
     * Moss
     * 
     */
    MOSS,

    /**
     * Moselweiss
     * 
     */
    MOSW,

    /**
     * Sassnitz
     * 
     */
    MUKR,

    /**
     * Mykonos
     * 
     */
    MYKO,

    /**
     * Mytiline
     * 
     */
    MYTI,

    /**
     * Naantali
     * 
     */
    NAAN,

    /**
     * Nador
     * 
     */
    NADO,

    /**
     * Naples
     * 
     */
    NAPL,

    /**
     * Naxos
     * 
     */
    NAXO,

    /**
     * Neapel
     * 
     */
    NEAP,

    /**
     * Neuwied
     * 
     */
    NEUW,

    /**
     * Newcastle
     * 
     */
    NEWC,

    /**
     * Newhaven UNICORN - pre UN/LOCODES.
     * 
     */
    NEWH,

    /**
     * Newhaven UNICORN - pre UN/LOCODES.
     * 
     */
    NEWL,

    /**
     * Newhaven UNICORN - pre UN/LOCODES.
     * 
     */
    NEWN,

    /**
     * Niederheimb.
     * 
     */
    NIEH,

    /**
     * Niederlahns.
     * 
     */
    NIEL,

    /**
     * Nice
     * 
     */
    NIZZ,

    /**
     * Oberlahnst.
     * 
     */
    OBLA,

    /**
     * Oberwesel
     * 
     */
    OBWE,

    /**
     * Olbia
     * 
     */
    OLBI,

    /**
     * Olib
     * 
     */
    OLIB,

    /**
     * Ostend
     * 
     */
    OOST,

    /**
     * Oran
     * 
     */
    ORAN,

    /**
     * Oslo
     * 
     */
    OSL,

    /**
     * Oslo
     * 
     */
    OSLO,

    /**
     * Palermo
     * 
     */
    PALE,

    /**
     * Palma Mallorca
     * 
     */
    PALM,

    /**
     * Paros
     * 
     */
    PARO,

    /**
     * Patmos
     * 
     */
    PATM,

    /**
     * Patras
     * 
     */
    PATR,

    /**
     * Paxi
     * 
     */
    PAXI,

    /**
     * Pembroke
     * 
     */
    PEMB,

    /**
     * Pescara
     * 
     */
    PESC,

    /**
     * Piombino
     * 
     */
    PIOM,

    /**
     * Piraeus
     * 
     */
    PIRA,

    /**
     * Plymouth UNICORN - pre UN/LOCODES.
     * 
     */
    PLYM,

    /**
     * Poole UNICORN - pre UN/LOCODES.
     * 
     */
    POOL,

    /**
     * Portbail
     * 
     */
    PORB,

    /**
     * Poros
     * 
     */
    PORO,

    /**
     * Portsmouth, Continental Ferry Terminal UNICORN - pre UN/LOCODES.
     * 
     */
    PORS,

    /**
     * Porto Ferraio
     * 
     */
    PORT,

    /**
     * Porto Vecchio
     * 
     */
    PORV,

    /**
     * Porz
     * 
     */
    PORZ,

    /**
     * Premuda
     * 
     */
    PREM,

    /**
     * Primosten
     * 
     */
    PRIM,

    /**
     * Propriano
     * 
     */
    PROP,

    /**
     * Porto Torres
     * 
     */
    PTOR,

    /**
     * Pto.rosario
     * 
     */
    PUER,

    /**
     * Puttgarden
     * 
     */
    PUTT,

    /**
     * Rab
     * 
     */
    RAB,

    /**
     * Rafina
     * 
     */
    RAFI,

    /**
     * Ravenna
     * 
     */
    RAVE,

    /**
     * Remagen
     * 
     */
    REMA,

    /**
     * Rethimnon
     * 
     */
    RETH,

    /**
     * Rhens
     * 
     */
    RHEN,

    /**
     * Rhodes
     * 
     */
    RHOD,

    /**
     * Rijeka
     * 
     */
    RIJE,

    /**
     * Roedby
     * 
     */
    ROED,

    /**
     * Roenne
     * 
     */
    ROEN,

    /**
     * Rosslare Lynx
     * 
     */
    ROLL,

    /**
     * Roscoff UNICORN - pre UN/LOCODES.
     * 
     */
    ROSC,

    /**
     * Rosslare UNICORN - pre UN/LOCODES.
     * 
     */
    ROSL,

    /**
     * Rosslare UNICORN - pre UN/LOCODES.
     * 
     */
    ROSS,

    /**
     * Rostock
     * 
     */
    ROST,

    /**
     * Rotterdam UNICORN - pre UN/LOCODES.
     * 
     */
    ROTT,

    /**
     * Ruedesheim
     * 
     */
    RUED,

    /**
     * Ruegen
     * 
     */
    RUEG,

    /**
     * Bad Salzig
     * 
     */
    SALZ,

    /**
     * Sami
     * 
     */
    SAMI,

    /**
     * Samos
     * 
     */
    SAMO,

    /**
     * San Antonio
     * 
     */
    SANA,

    /**
     * Sandefjord
     * 
     */
    SAD,

    /**
     * Sandefjord
     * 
     */
    SAND,

    /**
     * Santander
     * 
     */
    SANT,

    /**
     * Sark
     * 
     */
    SARK,

    /**
     * Sassnitz
     * 
     */
    SASS,

    /**
     * Santander
     * 
     */
    SATA,

    /**
     * Savona
     * 
     */
    SAVO,

    /**
     * S/c La Palma
     * 
     */
    SCPA,

    /**
     * Scrabster
     * 
     */
    SCRA,

    /**
     * Serifos
     * 
     */
    SERI,

    /**
     * Sete
     * 
     */
    SETE,

    /**
     * Sevilla
     * 
     */
    SEVI,

    /**
     * Seydisfjord.
     * 
     */
    SEYD,

    /**
     * Sfax
     * 
     */
    SFAX,

    /**
     * Schinousa
     * 
     */
    SHIN,

    /**
     * Sibenik
     * 
     */
    SIBE,

    /**
     * Sifnos
     * 
     */
    SIFN,

    /**
     * Sikinos
     * 
     */
    SIKI,

    /**
     * Silba
     * 
     */
    SILB,

    /**
     * Siros
     * 
     */
    SIRO,

    /**
     * Sitia
     * 
     */
    SITI,

    /**
     * Skagen
     * 
     */
    SKAG,

    /**
     * Skiathos
     * 
     */
    SKIA,

    /**
     * Skikda
     * 
     */
    SKIK,

    /**
     * Skopelos
     * 
     */
    SKOP,

    /**
     * Sobra
     * 
     */
    SOBR,

    /**
     * Soedertaelje
     * 
     */
    SODE,

    /**
     * Sousse
     * 
     */
    SOUS,

    /**
     * Southampton
     * 
     */
    SOUT,

    /**
     * Split
     * 
     */
    SPLI,

    /**
     * Spodsbjerg
     * 
     */
    SPOD,

    /**
     * Starigrad
     * 
     */
    STAR,

    /**
     * Stavenger
     * 
     */
    STAV,

    /**
     * Stettin
     * 
     */
    STET,

    /**
     * St.Goarshaus
     * 
     */
    STGH,

    /**
     * St.Goar
     * 
     */
    STGR,

    /**
     * St Malo UNICORN - pre UN/LOCODES.
     * 
     */
    STMA,

    /**
     * Stockholm
     * 
     */
    STOC,

    /**
     * St.Quay Por.
     * 
     */
    STQP,

    /**
     * Stranraer UNICORN - pre UN/LOCODES.
     * 
     */
    STRA,

    /**
     * Stranraer UNICORN - pre UN/LOCODES.
     * 
     */
    STRH,

    /**
     * Stromstad
     * 
     */
    SMD,

    /**
     * Stromstad
     * 
     */
    STRM,

    /**
     * Stranraer UNICORN - pre UN/LOCODES.
     * 
     */
    STRN,

    /**
     * Stromness
     * 
     */
    STRO,

    /**
     * S. Teresa di Gallura
     * 
     */
    STTE,

    /**
     * Swinemuende
     * 
     */
    SWIN,

    /**
     * Sylt
     * 
     */
    SYLT,

    /**
     * Symi
     * 
     */
    SYMI,

    /**
     * Syros
     * 
     */
    SYRO,

    /**
     * Tallin
     * 
     */
    TALL,

    /**
     * Tangier
     * 
     */
    TANG,

    /**
     * Tars
     * 
     */
    TARS,

    /**
     * Tenerife
     * 
     */
    TENE,

    /**
     * Tinos
     * 
     */
    TINO,

    /**
     * Torshavn
     * 
     */
    TORS,

    /**
     * Toulon
     * 
     */
    TOUL,

    /**
     * Trapani
     * 
     */
    TRAP,

    /**
     * Travemunde
     * 
     */
    TRAV,

    /**
     * Treis-karden
     * 
     */
    TREI,

    /**
     * Trelleborg
     * 
     */
    TREL,

    /**
     * Troon
     * 
     */
    TRON,

    /**
     * Triest
     * 
     */
    TRST,

    /**
     * Tunis
     * 
     */
    TUNI,

    /**
     * Turku
     * 
     */
    TURK,

    /**
     * Ubli
     * 
     */
    UBLI,

    /**
     * Umeaa
     * 
     */
    UMEA,

    /**
     * Unkel
     * 
     */
    UNKE,

    /**
     * Vaasa
     * 
     */
    VAAS,

    /**
     * Valencia
     * 
     */
    VALE,

    /**
     * Valverde
     * 
     */
    VALV,

    /**
     * Varberg
     * 
     */
    VARB,

    /**
     * Vathi
     * 
     */
    VATH,

    /**
     * Vela Luka
     * 
     */
    VELA,

    /**
     * Venedig
     * 
     */
    VENE,

    /**
     * Vis
     * 
     */
    VIS,

    /**
     * Volos
     * 
     */
    VOLO,

    /**
     * Warnemuende
     * 
     */
    WARN,

    /**
     * Wedel
     * 
     */
    WEDE,

    /**
     * Wesseling
     * 
     */
    WESS,

    /**
     * Wien
     * 
     */
    WIEN,

    /**
     * Wiesbaden-b.
     * 
     */
    WIES,

    /**
     * Winningen
     * 
     */
    WINN,

    /**
     * Wismar
     * 
     */
    WISM,

    /**
     * Ystad
     * 
     */
    YSTA,

    /**
     * Zadar
     * 
     */
    ZADA,

    /**
     * Zakynthos
     * 
     */
    ZAKY,

    /**
     * Zante
     * 
     */
    ZANT,

    /**
     * Zeebrugge
     * 
     */
    ZEEB;

    public String value() {
        return name();
    }

    public static PortCode fromValue(String v) {
        return valueOf(v);
    }

}
