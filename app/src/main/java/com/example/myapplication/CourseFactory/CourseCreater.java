package com.example.myapplication.CourseFactory;

public class CourseCreater {
    public static Course createCourse(CourseType type, String code, String name, String term, String career, String unit, String mode, String link) {
        Course create = null;
        switch (type) {
            case POGO: {
                create = new CourseClasses.POGO();
                break;
            }
            case HIST: {
                create = new CourseClasses.HIST();
                break;
            }
            case THES: {
                create = new CourseClasses.THES();
                break;
            }
            case ENVS: {
                create = new CourseClasses.ENVS();
                break;
            }
            case MEDN: {
                create = new CourseClasses.MEDN();
                break;
            }
            case TOKP: {
                create = new CourseClasses.TOKP();
                break;
            }
            case SCOM: {
                create = new CourseClasses.SCOM();
                break;
            }
            case ANIP: {
                create = new CourseClasses.ANIP();
                break;
            }
            case ARAB: {
                create = new CourseClasses.ARAB();
                break;
            }
            case COMP: {
                create = new CourseClasses.COMP();
                break;
            }
            case POPH: {
                create = new CourseClasses.POPH();
                break;
            }
            case POPM: {
                create = new CourseClasses.POPM();
                break;
            }
            case EMDV: {
                create = new CourseClasses.EMDV();
                break;
            }
            case ACST: {
                create = new CourseClasses.ACST();
                break;
            }
            case PASI: {
                create = new CourseClasses.PASI();
                break;
            }
            case SCNC: {
                create = new CourseClasses.SCNC();
                break;
            }
            case CBEA: {
                create = new CourseClasses.CBEA();
                break;
            }
            case MATH: {
                create = new CourseClasses.MATH();
                break;
            }
            case HONS: {
                create = new CourseClasses.HONS();
                break;
            }
            case ASTR: {
                create = new CourseClasses.ASTR();
                break;
            }
            case LAWS: {
                create = new CourseClasses.LAWS();
                break;
            }
            case GEND: {
                create = new CourseClasses.GEND();
                break;
            }
            case PHYS: {
                create = new CourseClasses.PHYS();
                break;
            }
            case MEDI: {
                create = new CourseClasses.MEDI();
                break;
            }
            case PHIL: {
                create = new CourseClasses.PHIL();
                break;
            }
            case ECHI: {
                create = new CourseClasses.ECHI();
                break;
            }
            case INTR: {
                create = new CourseClasses.INTR();
                break;
            }
            case CLAS: {
                create = new CourseClasses.CLAS();
                break;
            }
            case ARCH: {
                create = new CourseClasses.ARCH();
                break;
            }
            case INDG: {
                create = new CourseClasses.INDG();
                break;
            }
            case ANCH: {
                create = new CourseClasses.ANCH();
                break;
            }
            case HUMN: {
                create = new CourseClasses.HUMN();
                break;
            }
            case VCPG: {
                create = new CourseClasses.VCPG();
                break;
            }
            case EXTN: {
                create = new CourseClasses.EXTN();
                break;
            }
            case INDN: {
                create = new CourseClasses.INDN();
                break;
            }
            case CECS: {
                create = new CourseClasses.CECS();
                break;
            }
            case FREN: {
                create = new CourseClasses.FREN();
                break;
            }
            case CHIN: {
                create = new CourseClasses.CHIN();
                break;
            }
            case HIND: {
                create = new CourseClasses.HIND();
                break;
            }
            case HLTH: {
                create = new CourseClasses.HLTH();
                break;
            }
            case TURK: {
                create = new CourseClasses.TURK();
                break;
            }
            case CRWF: {
                create = new CourseClasses.CRWF();
                break;
            }
            case DIPL: {
                create = new CourseClasses.DIPL();
                break;
            }
            case MNGL: {
                create = new CourseClasses.MNGL();
                break;
            }
            case PSYC: {
                create = new CourseClasses.PSYC();
                break;
            }
            case SPAN: {
                create = new CourseClasses.SPAN();
                break;
            }
            case ARTV: {
                create = new CourseClasses.ARTV();
                break;
            }
            case ENGL: {
                create = new CourseClasses.ENGL();
                break;
            }
            case ARTS: {
                create = new CourseClasses.ARTS();
                break;
            }
            case BAPA: {
                create = new CourseClasses.BAPA();
                break;
            }
            case ENGN: {
                create = new CourseClasses.ENGN();
                break;
            }
            case STAT: {
                create = new CourseClasses.STAT();
                break;
            }
            case EMET: {
                create = new CourseClasses.EMET();
                break;
            }
            case BIOL: {
                create = new CourseClasses.BIOL();
                break;
            }
            case ARTH: {
                create = new CourseClasses.ARTH();
                break;
            }
            case REGN: {
                create = new CourseClasses.REGN();
                break;
            }
            case ANTH: {
                create = new CourseClasses.ANTH();
                break;
            }
            case PPEI: {
                create = new CourseClasses.PPEI();
                break;
            }
            case DESN: {
                create = new CourseClasses.DESN();
                break;
            }
            case VIET: {
                create = new CourseClasses.VIET();
                break;
            }
            case LATN: {
                create = new CourseClasses.LATN();
                break;
            }
            case TETM: {
                create = new CourseClasses.TETM();
                break;
            }
            case INFS: {
                create = new CourseClasses.INFS();
                break;
            }
            case DESA: {
                create = new CourseClasses.DESA();
                break;
            }
            case INFT: {
                create = new CourseClasses.INFT();
                break;
            }
            case CHST: {
                create = new CourseClasses.CHST();
                break;
            }
            case MMIB: {
                create = new CourseClasses.MMIB();
                break;
            }
            case NSPO: {
                create = new CourseClasses.NSPO();
                break;
            }
            case CHMD: {
                create = new CourseClasses.CHMD();
                break;
            }
            case WARS: {
                create = new CourseClasses.WARS();
                break;
            }
            case PORT: {
                create = new CourseClasses.PORT();
                break;
            }
            case STST: {
                create = new CourseClasses.STST();
                break;
            }
            case TIBN: {
                create = new CourseClasses.TIBN();
                break;
            }
            case JPNS: {
                create = new CourseClasses.JPNS();
                break;
            }
            case SCRN: {
                create = new CourseClasses.SCRN();
                break;
            }
            case BIAN: {
                create = new CourseClasses.BIAN();
                break;
            }
            case NEUR: {
                create = new CourseClasses.NEUR();
                break;
            }
            case ITAL: {
                create = new CourseClasses.ITAL();
                break;
            }
            case KORE: {
                create = new CourseClasses.KORE();
                break;
            }
            case MKTG: {
                create = new CourseClasses.MKTG();
                break;
            }
            case GERM: {
                create = new CourseClasses.GERM();
                break;
            }
            case THAI: {
                create = new CourseClasses.THAI();
                break;
            }
            case SKRT: {
                create = new CourseClasses.SKRT();
                break;
            }
            case RUSS: {
                create = new CourseClasses.RUSS();
                break;
            }
            case CRIM: {
                create = new CourseClasses.CRIM();
                break;
            }
            case EURO: {
                create = new CourseClasses.EURO();
                break;
            }
            case LANG: {
                create = new CourseClasses.LANG();
                break;
            }
            case BURM: {
                create = new CourseClasses.BURM();
                break;
            }
            case CHEM: {
                create = new CourseClasses.CHEM();
                break;
            }
            case PERS: {
                create = new CourseClasses.PERS();
                break;
            }
            case ASIA: {
                create = new CourseClasses.ASIA();
                break;
            }
            case LING: {
                create = new CourseClasses.LING();
                break;
            }
            case BPHB: {
                create = new CourseClasses.BPHB();
                break;
            }
            case VCUG: {
                create = new CourseClasses.VCUG();
                break;
            }
            case EMSC: {
                create = new CourseClasses.EMSC();
                break;
            }
            case MUSI: {
                create = new CourseClasses.MUSI();
                break;
            }
            case IDEC: {
                create = new CourseClasses.IDEC();
                break;
            }
            case MUSC: {
                create = new CourseClasses.MUSC();
                break;
            }
            case ECON: {
                create = new CourseClasses.ECON();
                break;
            }
            case FINM: {
                create = new CourseClasses.FINM();
                break;
            }
            case POLS: {
                create = new CourseClasses.POLS();
                break;
            }
            case MGMT: {
                create = new CourseClasses.MGMT();
                break;
            }
            case SOCR: {
                create = new CourseClasses.SOCR();
                break;
            }
            case MEAS: {
                create = new CourseClasses.MEAS();
                break;
            }
            case GREK: {
                create = new CourseClasses.GREK();
                break;
            }
            case BUSN: {
                create = new CourseClasses.BUSN();
                break;
            }
            case SOCY: {
                create = new CourseClasses.SOCY();
                break;
            }
            case BUSI: {
                create = new CourseClasses.BUSI();
                break;
            }
            case DEMO: {
                create = new CourseClasses.DEMO();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid course type: " + type);
            }
        }
        if (create != null) {
            create.suffix = "";
            if (code.length() == 9)
                create.suffix = code.substring(8);
            create.courseCode = Integer.parseInt(code.substring(4,8));
            create.name = name;
            create.term = term;
            create.career = career;
            create.unit = Integer.parseInt(unit);
            create.mode = mode;
            create.link = link;
        }
        return create;
    }
}
