package com.example.HeartDiseaselocal.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.breastcancerlocal.database.DataBaseManger
import com.example.breastcancerlocal.model.HeartDisease
import com.example.breastcancerlocal.model.HeartDiseaseVO
import java.util.ArrayList

class HeartDiseaseCRUDViewModel constructor(context: Context): ViewModel() {

    private var dbm: DataBaseManger = DataBaseManger (context)
    private var currentHeartDisease: HeartDiseaseVO? = null
    private var currentHeartDiseases: ArrayList<HeartDiseaseVO> = ArrayList()

    companion object {
        private var instance: HeartDiseaseCRUDViewModel? = null
        fun getInstance(context: Context): HeartDiseaseCRUDViewModel {
            return instance ?: HeartDiseaseCRUDViewModel(context)
        }
    }

    fun stringListHeartDisease(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (x in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[x].toString())
        }
        return res
    }

    fun getHeartDiseaseByPK(value: String): HeartDisease? {
        val res: List<HeartDiseaseVO> = dbm.searchByHeartDiseaseid(value)
        return if (res.isEmpty()) {
            null
        } else {
            val vo: HeartDiseaseVO = res[0]
            val itemx = HeartDisease.createByPKHeartDisease(value)
            itemx.id = vo.getId()
            itemx.age = vo.getAge()
            itemx.sex = vo.getSex()
            itemx.cp = vo.getCp()
            itemx.trestbps = vo.getRestecg()
            itemx.chol = vo.getChol()
            itemx.fbs = vo.getFbs()
            itemx.restecg = vo.getRestecg()
            itemx.thalach = vo.getThalach()
            itemx.exang = vo.getExang()
            itemx.oldpeak = vo.getOldpeak()
            itemx.slope = vo.getSlope()
            itemx.ca = vo.getCa()
            itemx.thal = vo.getThal()
            itemx.outcome = vo.getOutcome()
            itemx
        }
    }

    fun retrieveHeartDisease(value: String): HeartDisease? {
        return getHeartDiseaseByPK(value)
    }

    fun allHeartDiseaseids(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getId())
        }
        return res
    }

    fun allHeartDiseaseages(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getAge().toString())
        }
        return res
    }

    fun allHeartDiseasesexs(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getSex().toString())
        }
        return res
    }

    fun allHeartDiseasecps(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getCp().toString())
        }
        return res
    }

    fun allHeartDiseasetrestbpss(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getTrestbps().toString())
        }
        return res
    }

    fun allHeartDiseasechols(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getChol().toString())
        }
        return res
    }

    fun allHeartDiseasefbss(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getFbs().toString())
        }
        return res
    }

    fun allHeartDiseaserestecgs(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getRestecg().toString())
        }
        return res
    }

    fun allHeartDiseasethalachs(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getThalach().toString())
        }
        return res
    }

    fun allHeartDiseaseexangs(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getExang().toString())
        }
        return res
    }

    fun allHeartDiseaseoldpeaks(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getOldpeak().toString())
        }
        return res
    }

    fun allHeartDiseaseslopes(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getSlope().toString())
        }
        return res
    }

    fun allHeartDiseasecas(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getCa().toString())
        }
        return res
    }

    fun allHeartDiseasethals(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getThal().toString())
        }
        return res
    }

    fun allHeartDiseaseoutcomes(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].getOutcome().toString())
        }
        return res
    }

    fun setSelectedHeartDisease(x: HeartDiseaseVO) {
        currentHeartDisease = x
    }

    fun setSelectedMeal(i: Int) {
        if (i < currentHeartDiseases.size) {
            currentHeartDisease = currentHeartDiseases[i]
        }
    }

    fun getSelectedHeartDisease(): HeartDiseaseVO? {
        return currentHeartDisease
    }

    fun persistHeartDisease(x: HeartDisease) {
        val vo = HeartDiseaseVO(x)
        dbm.editHeartDisease(vo)
        currentHeartDisease = vo
    }

    fun listHeartDisease(): ArrayList<HeartDiseaseVO> {
        currentHeartDiseases = dbm.listHeartDisease()
        return currentHeartDiseases
    }

    fun editHeartDisease(x: HeartDiseaseVO) {
        dbm.editHeartDisease(x)
        currentHeartDisease = x
    }

    fun createHeartDisease(x: HeartDiseaseVO) {
        dbm.createHeartDisease(x)
        currentHeartDisease = x
    }

    fun deleteHeartDisease(id: String) {
        dbm.deleteHeartDisease(id)
        currentHeartDisease = null
    }

    fun searchByHeartDiseaseid(idx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseid(idx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseage(agex: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseage(agex)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasesex(sexx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasesex(sexx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasecp(cpx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasecp(cpx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasetrestbps(trestbpsx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasetrestbps(trestbpsx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasechol(cholx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasechol(cholx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasefbs(fbsx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasefbs(fbsx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaserestecg(restecgx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaserestecg(restecgx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseoldpeak(oldpeakx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseoldpeak(oldpeakx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseslope(slopex: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseslope(slopex)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseca(cax: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseca(cax)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasethal(thalx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasethal(thalx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseoutcome(outcomex: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseoutcome(outcomex)
        return currentHeartDiseases
    }

}