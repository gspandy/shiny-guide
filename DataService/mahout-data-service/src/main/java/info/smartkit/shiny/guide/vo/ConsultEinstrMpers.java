package info.smartkit.shiny.guide.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by smartkit on 03/07/2017.
 */
@Entity
public class ConsultEinstrMpers {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;


        public ConsultEinstrMpers() {
        }

        @Override public String toString() {
                return "ConsultEinstrMpers{" + "id=" + id + ", eiid=" + eiid + ", mpid=" + mpid + ", einame='" + einame + '\'' + ", eicontent='" + eicontent + '\'' + ", mpname='" + mpname + '\'' + ", mpcontent='" + mpcontent + '\'' + '}';
        }

        public long getEiid() {
                return eiid;
        }

        public void setEiid(long eiid) {
                this.eiid = eiid;
        }

        public long getMpid() {
                return mpid;
        }

        public void setMpid(long mpid) {
                this.mpid = mpid;
        }

        public String getEiname() {
                return einame;
        }

        public void setEiname(String einame) {
                this.einame = einame;
        }

        public String getEicontent() {
                return eicontent;
        }

        public void setEicontent(String eicontent) {
                this.eicontent = eicontent;
        }

        public String getMpname() {
                return mpname;
        }

        public void setMpname(String mpname) {
                this.mpname = mpname;
        }

        public String getMpcontent() {
                return mpcontent;
        }

        public void setMpcontent(String mpcontent) {
                this.mpcontent = mpcontent;
        }

        private long eiid;
        private long mpid;
        private String einame;
        private String eicontent;
        private String mpname;
        private String mpcontent;

}