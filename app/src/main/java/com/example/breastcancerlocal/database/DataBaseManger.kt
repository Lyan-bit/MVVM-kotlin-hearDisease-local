package com.example.breastcancerlocal.database

import android.content.Context
import com.example.breastcancerlocal.model.HeartDiseaseVO
import java.util.ArrayList

class DataBaseManger constructor(context: Context) : HeartDiseases {
    private var db: DB

    init {
        db = DB(context, null)
    }

    override fun listHeartDisease(): ArrayList<HeartDiseaseVO> {
        return db.listHeartDisease()
    }

    override fun editHeartDisease(x: HeartDiseaseVO) {
        db.editHeartDisease(x)
    }

    override fun createHeartDisease(x: HeartDiseaseVO) {
        db.createHeartDisease(x)
    }

    override fun deleteHeartDisease(id: String) {
        db.deleteHeartDisease(id)
    }

    override fun searchByHeartDiseaseid(idx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseaseid(idx)
    }

    override fun searchByHeartDiseaseage(agex: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseaseage(agex)
    }

    override fun searchByHeartDiseasesex(sexx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseasesex(sexx)
    }

    override fun searchByHeartDiseasecp(cpx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseasecp(cpx)
    }

    override fun searchByHeartDiseasetrestbps(trestbpsx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseasetrestbps(trestbpsx)
    }

    override fun searchByHeartDiseasechol(cholx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseasechol(cholx)
    }

    override fun searchByHeartDiseasefbs(fbsx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseasefbs(fbsx)
    }

    override fun searchByHeartDiseaserestecg(restecgx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseaserestecg(restecgx)
    }


    override fun searchByHeartDiseaseoldpeak(oldpeakx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseaseoldpeak(oldpeakx)
    }

    override fun searchByHeartDiseaseslope(slopex: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseaseslope(slopex)
    }

    override fun searchByHeartDiseaseca(cax: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseaseca(cax)
    }

    override fun searchByHeartDiseasethal(thalx: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseasethal(thalx)
    }

    override fun searchByHeartDiseaseoutcome(outcomex: String): ArrayList<HeartDiseaseVO> {
        return db.searchByHeartDiseaseoutcome(outcomex)
    }
}