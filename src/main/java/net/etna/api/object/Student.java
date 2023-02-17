package net.etna.api.object;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eliott Belinguier
 * @since 1.0
 * @version 1.0
 */
public class Student extends User {

    @SerializedName("birthday")
    protected final Date birthDate;
    @SerializedName("birthday_place")
    public final String birthPlace;
    @SerializedName("nationality")
    public final String nationality;
    @SerializedName("email_etna")
    public final String emailEtna;
    @SerializedName("tel_pro")
    public final String professionalPhone;
    @SerializedName("bac_serie")
    public final String bacSerie;
    @SerializedName("bac_year")
    public final String bacYear;
    @SerializedName("learning_origin")
    public final String learningOrigin;
    @SerializedName("school_origin")
    public final String schoolOrigin;
    @SerializedName("learning_accomplished")
    public final String learningAccomplished;
    @SerializedName("in_etna_date")
    protected final Date inEtnaDate;
    @SerializedName("out_etna_date")
    protected final Date outEtnaDate;
    @SerializedName("social_organisation")
    public final String socialOrganisation;
    @SerializedName("social_number")
    public final String socialNumber;
    @SerializedName("social_situation")
    public final String socialSituation;
    @SerializedName("social_complement")
    public final String socialComplement;
    @SerializedName("insurer")
    public final String insurer;
    @SerializedName("insurance_number")
    public final String insuranceNumber;
    @SerializedName("referent")
    public final String referentName;
    @SerializedName("residence_premit_expiration")
    protected final Date residencePermitExpiration;
    @SerializedName("prospect_url")
    public final String prospectURL;
    @SerializedName("scholarship")
    public final String scholarShip;
    @SerializedName("handicaped")
    public final String handicapped;
    @SerializedName("pole_emploi_status")
    public final String poleEmploiStatus;
    @SerializedName("pole_emploi_number")
    public final String poleEmploiNumber;
    @SerializedName("pole_emploi_date")
    protected final Date poleEmploiDate;
    @SerializedName("contacts")
    protected final Map<String, Contact> contacts;
    @SerializedName("higher_degree")
    public final String higherDegree;
    @SerializedName("target_degree")
    public final String targetDegree;
    @SerializedName("salutation")
    public final String salutation;
    @SerializedName("tel")
    public final String tel;
    @SerializedName("mobile")
    public final String mobile;
    @SerializedName("address1")
    public final String address1;
    @SerializedName("address2")
    public final String address2;
    @SerializedName("zip_code")
    public final String zipCode;
    @SerializedName("city")
    public final String city;
    @SerializedName("country")
    public final String country;

    public Date getBirthDate() {
        return this.birthDate != null ? new Date(this.birthDate.getTime()) : null;
    }

    public Date getInEtnaDate() {
        return this.inEtnaDate != null ? new Date(this.inEtnaDate.getTime()) : null;
    }

    public Date getOutEtnaDate() {
        return this.outEtnaDate != null ? new Date(this.outEtnaDate.getTime()) : null;
    }

    public Date getResidencePermitExpiration() {
        return this.residencePermitExpiration != null ? new Date(this.residencePermitExpiration.getTime()) : null;
    }

    public Date getPoleEmploiDate() {
        return this.poleEmploiDate != null ? new Date(this.poleEmploiDate.getTime()) : null;
    }

    protected Student() {
        this.birthDate = null;
        this.birthPlace = null;
        this.nationality = null;
        this.emailEtna = null;
        this.professionalPhone = null;
        this.bacSerie = null;
        this.bacYear = null;
        this.learningOrigin = null;
        this.schoolOrigin = null;
        this.learningAccomplished = null;
        this.inEtnaDate = null;
        this.outEtnaDate = null;
        this.socialOrganisation = null;
        this.socialNumber = null;
        this.socialSituation = null;
        this.socialComplement = null;
        this.insurer = null;
        this.insuranceNumber = null;
        this.referentName = null;
        this.residencePermitExpiration = null;
        this.prospectURL = null;
        this.scholarShip = null;
        this.handicapped = null;
        this.poleEmploiStatus = null;
        this.poleEmploiNumber = null;
        this.poleEmploiDate = null;
        this.contacts = new HashMap<String, Contact>();
        this.higherDegree = null;
        this.targetDegree = null;
        this.salutation = null;
        this.tel = null;
        this.mobile = null;
        this.address1 = null;
        this.address2 = null;
        this.zipCode = null;
        this.city = null;
        this.country = null;
    }

    /**
     * @author Eliott Belinguier
     * @since 1.0
     * @version 1.0
     */
    public static class Contact {

        @SerializedName("salutation")
        public final String salutation;
        @SerializedName("lastname")
        public final String lastName;
        @SerializedName("firstname")
        public final String firstName;
        @SerializedName("email")
        public final String email;
        @SerializedName("tel")
        public final String tel;
        @SerializedName("mobile")
        public final String mobile;
        @SerializedName("address1")
        public final String address1;
        @SerializedName("address2")
        public final String address2;
        @SerializedName("zip_code")
        public final String zipCode;
        @SerializedName("city")
        public final String city;
        @SerializedName("country")
        public final String country;

        protected Contact() {
            this.salutation = null;
            this.lastName = null;
            this.firstName = null;
            this.email = null;
            this.tel = null;
            this.mobile = null;
            this.address1 = null;
            this.address2 = null;
            this.zipCode = null;
            this.city = null;
            this.country = null;
        }

    }

    /**
     * @author Eliott Belinguier
     * @since 1.0
     * @version 1.0
     */
    public static class Term {

        @SerializedName("id")
        public final long id;
        @SerializedName("term_name")
        public final String termName;
        @SerializedName("promo")
        public final String promo;
        @SerializedName("spe")
        public final String spe;
        @SerializedName("learning_start")
        public final String learningStart;
        @SerializedName("learning_end")
        public final String learningEnd;
        @SerializedName("resignation_date")
        protected final Date resignationDate;
        @SerializedName("status")
        protected final String status;
        @SerializedName("created_at")
        protected final Date createdAt;
        @SerializedName("validated_at")
        protected final Date validatedAt;
        @SerializedName("denied_at")
        protected final Date deniedAt;

        protected Term() {
            this.id = -1;
            this.termName = null;
            this.promo = null;
            this.spe = null;
            this.learningStart = null;
            this.learningEnd = null;
            this.resignationDate = null;
            this.status = null;
            this.createdAt = null;
            this.validatedAt = null;
            this.deniedAt = null;
        }

        public Date getResignationDate() {
            return this.resignationDate != null ? new Date(this.resignationDate.getTime()) : null;
        }

        public Date getCreatedAt() {
            return this.createdAt != null ? new Date(this.createdAt.getTime()) : null;
        }

        public Date getValidatedAt() {
            return this.validatedAt != null ? new Date(this.validatedAt.getTime()) : null;
        }

        public Date getDeniedAt() {
            return this.deniedAt != null ? new Date(this.deniedAt.getTime()) : null;
        }

    }

    /**
     * @author Eliott Belinguier
     * @since 1.0
     * @version 1.0
     */
    public static class Contract {

        @SerializedName("id")
        public final long id;
        @SerializedName("company")
        public final String company;
        @SerializedName("workflow_type")
        public final String workflowType;
        @SerializedName("work_start")
        protected final Date workStart;
        @SerializedName("work_end")
        protected final Date workEnd;
        @SerializedName("learning_start")
        protected final Date learningStart;
        @SerializedName("learning_end")
        protected final Date learningEnd;
        @SerializedName("broken_at")
        protected final Date brokenAt;
        @SerializedName("deleted_at")
        protected final Date deletedAt;
        @SerializedName("created_at")
        protected final Date createdAt;
        @SerializedName("updated_at")
        protected final Date updatedAt;
        @SerializedName("validated_at")
        protected final Date validatedAt;

        public Contract() {
            this.id = -1;
            this.company = null;
            this.workflowType = null;
            this.workStart = null;
            this.workEnd = null;
            this.learningStart = null;
            this.learningEnd = null;
            this.brokenAt = null;
            this.deletedAt = null;
            this.createdAt = null;
            this.updatedAt = null;
            this.validatedAt = null;
        }

        public Date getWorkStart() {
            return this.workStart != null ? new Date(this.workStart.getTime()) : null;
        }

        public Date getWorkEnd() {
            return this.workEnd != null ? new Date(this.workEnd.getTime()) : null;
        }

        public Date getLearningStart() {
            return this.learningStart != null ? new Date(this.learningStart.getTime()) : null;
        }

        public Date getLearningEnd() {
            return this.learningEnd != null ? new Date(this.learningEnd.getTime()) : null;
        }

        public Date getBrokenAt() {
            return this.brokenAt != null ? new Date(this.brokenAt.getTime()) : null;
        }

        public Date getDeletedAt() {
            return this.deletedAt != null ? new Date(this.deletedAt.getTime()) : null;
        }

        public Date getCreatedAt() {
            return this.createdAt != null ? new Date(this.createdAt.getTime()) : null;
        }

        public Date getUpdatedAt() {
            return this.updatedAt != null ? new Date(this.updatedAt.getTime()) : null;
        }

        public Date getValidatedAt() {
            return this.validatedAt != null ? new Date(this.validatedAt.getTime()) : null;
        }

    }

}
