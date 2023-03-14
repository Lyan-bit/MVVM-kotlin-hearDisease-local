package com.example.breastcancerlocal.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.breastcancerlocal.model.HeartDiseaseVO

class DB (context: Context, factory: SQLiteDatabase.CursorFactory?) :
	SQLiteOpenHelper(context, DATABASENAME, factory, DATABASEVERSION) {

	companion object{
		lateinit var database: SQLiteDatabase

		private val DATABASENAME = "heartdiseaseApp.db"
		private val DATABASEVERSION = 1

		const val HeartDiseaseTABLENAME = "HeartDisease"
		const val HeartDiseaseCOLIDTable = 0
		const val HeartDiseaseCOLID = 1
		const val HeartDiseaseCOLAGE = 2
		const val HeartDiseaseCOLSEX = 3
		const val HeartDiseaseCOLCP = 4
		const val HeartDiseaseCOLTRESTBPS = 5
		const val HeartDiseaseCOLCHOL = 6
		const val HeartDiseaseCOLFBS = 7
		const val HeartDiseaseCOLRESTECG = 8
		const val HeartDiseaseCOLTHALACH = 9
		const val HeartDiseaseCOLEXANG = 10
		const val HeartDiseaseCOLOLDPEAK = 11
		const val HeartDiseaseCOLSLOPE = 12
		const val HeartDiseaseCOLCA = 13
		const val HeartDiseaseCOLTHAL = 14
		const val HeartDiseaseCOLOUTCOME = 15

		val HeartDiseaseCOLS: Array<String> = arrayOf<String>("idTable", "id", "age", "sex", "cp", "trestbps", "chol", "fbs", "restecg", "thalach", "exang", "oldpeak", "slope", "ca", "thal", "outcome")
		const val HeartDiseaseNUMBERCOLS = 15

	}
	private val HeartDiseaseCREATESCHEMA =
		"create table HeartDisease (idTable integer primary key autoincrement" +
				", id VARCHAR(50) not null"+
				", age integer not null"+
				", sex integer not null"+
				", cp integer not null"+
				", trestbps integer not null"+
				", chol integer not null"+
				", fbs integer not null"+
				", restecg integer not null"+
				", thalach integer not null"+
				", exang integer not null"+
				", oldpeak integer not null"+
				", slope integer not null"+
				", ca integer not null"+
				", thal integer not null"+
				", outcome VARCHAR(50) not null"+
				")"

	override fun onCreate(db: SQLiteDatabase) {
		db.execSQL(HeartDiseaseCREATESCHEMA)
	}

	override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
		db.execSQL("DROP TABLE IF EXISTS " + HeartDiseaseCREATESCHEMA)
		onCreate(db)
	}

	fun onDestroy() {
		database.close()
	}

	fun listHeartDisease(): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val cursor: Cursor =
			database.query(HeartDiseaseTABLENAME, HeartDiseaseCOLS, null, null, null, null, null)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun createHeartDisease(heartdiseasevo: HeartDiseaseVO) {
		database = writableDatabase
		database.insert(HeartDiseaseTABLENAME, HeartDiseaseCOLS[1], putData(heartdiseasevo))
	}

	fun searchByHeartDiseaseid(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where id = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseaseage(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where age = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseasesex(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where sex = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseasecp(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where cp = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseasetrestbps(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where trestbps = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseasechol(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where chol = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseasefbs(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where fbs = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseaserestecg(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where restecg = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseasethalach(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where thalach = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseaseexang(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where exang = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseaseoldpeak(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where oldpeak = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseaseslope(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where slope = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseaseca(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where ca = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseasethal(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select idTable, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where thal = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}

	fun searchByHeartDiseaseoutcome(value: String): ArrayList<HeartDiseaseVO> {
		val res = ArrayList<HeartDiseaseVO>()
		database = readableDatabase
		val args = arrayOf(value)
		val cursor: Cursor = database.rawQuery(
			"select id, id, age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, outcome from HeartDisease where outcome = ?",
			args
		)
		cursor.moveToFirst()
		while (!cursor.isAfterLast()) {
			res.add(setData(cursor))
			cursor.moveToNext()
		}
		cursor.close()
		return res
	}


	fun editHeartDisease(heartdiseasevo: HeartDiseaseVO) {
		database = writableDatabase
		val args = arrayOf(heartdiseasevo.getId())
		database.update(HeartDiseaseTABLENAME, putData(heartdiseasevo), "id =?", args)
	}

	fun deleteHeartDisease(value: String) {
		database = writableDatabase
		val args = arrayOf(value)
		database.delete(HeartDiseaseTABLENAME, "id = ?", args)
	}

	private fun setData(cursor: Cursor): HeartDiseaseVO {
		val heartdiseasevo = HeartDiseaseVO()
		heartdiseasevo.setId(cursor.getString(HeartDiseaseCOLID))
		heartdiseasevo.setAge(cursor.getInt(HeartDiseaseCOLAGE))
		heartdiseasevo.setSex(cursor.getInt(HeartDiseaseCOLSEX))
		heartdiseasevo.setCp(cursor.getInt(HeartDiseaseCOLCP))
		heartdiseasevo.setTrestbps(cursor.getInt(HeartDiseaseCOLTRESTBPS))
		heartdiseasevo.setChol(cursor.getInt(HeartDiseaseCOLCHOL))
		heartdiseasevo.setFbs(cursor.getInt(HeartDiseaseCOLFBS))
		heartdiseasevo.setRestecg(cursor.getInt(HeartDiseaseCOLRESTECG))
		heartdiseasevo.setThalach(cursor.getInt(HeartDiseaseCOLTHALACH))
		heartdiseasevo.setExang(cursor.getInt(HeartDiseaseCOLEXANG))
		heartdiseasevo.setOldpeak(cursor.getInt(HeartDiseaseCOLOLDPEAK))
		heartdiseasevo.setSlope(cursor.getInt(HeartDiseaseCOLSLOPE))
		heartdiseasevo.setCa(cursor.getInt(HeartDiseaseCOLCA))
		heartdiseasevo.setThal(cursor.getInt(HeartDiseaseCOLTHAL))
		heartdiseasevo.setOutcome(cursor.getString(HeartDiseaseCOLOUTCOME))

		return heartdiseasevo
	}

	private fun putData(heartdiseasevo: HeartDiseaseVO): ContentValues {
		val wr = ContentValues(HeartDiseaseNUMBERCOLS)
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLID], heartdiseasevo.getId())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLAGE], heartdiseasevo.getAge())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLSEX], heartdiseasevo.getSex())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLCP], heartdiseasevo.getCp())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLTRESTBPS], heartdiseasevo.getTrestbps())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLCHOL], heartdiseasevo.getChol())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLFBS], heartdiseasevo.getFbs())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLRESTECG], heartdiseasevo.getRestecg())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLTHALACH], heartdiseasevo.getThalach())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLEXANG], heartdiseasevo.getExang())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLOLDPEAK], heartdiseasevo.getOldpeak())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLSLOPE], heartdiseasevo.getSlope())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLCA], heartdiseasevo.getCa())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLTHAL], heartdiseasevo.getThal())
		wr.put(HeartDiseaseCOLS[HeartDiseaseCOLOUTCOME], heartdiseasevo.getOutcome())
		return wr
	}

}
