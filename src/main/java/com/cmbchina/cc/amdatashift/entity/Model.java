package com.cmbchina.cc.amdatashift.entity;

public class Model {
	private String ModelId;
	private int SeqNum;
	private int ModelDesc;
	private String ColumeType;
	private int ColumeStartPosition;
	private int ColumeLength;
	private String MainColumeTag;
	private String CsvColumeTag;
	private String FileOrgType;
	public String getModelId() {
		return ModelId;
	}
	public void setModelId(String modelId) {
		ModelId = modelId;
	}
	public int getSeqNum() {
		return SeqNum;
	}
	public void setSeqNum(int seqNum) {
		SeqNum = seqNum;
	}
	public int getModelDesc() {
		return ModelDesc;
	}
	public void setModelDesc(int modelDesc) {
		ModelDesc = modelDesc;
	}
	public String getColumeType() {
		return ColumeType;
	}
	public void setColumeType(String columeType) {
		ColumeType = columeType;
	}
	public int getColumeStartPosition() {
		return ColumeStartPosition;
	}
	public void setColumeStartPosition(int columeStartPosition) {
		ColumeStartPosition = columeStartPosition;
	}
	public int getColumeLength() {
		return ColumeLength;
	}
	public void setColumeLength(int columeLength) {
		ColumeLength = columeLength;
	}
	public String getMainColumeTag() {
		return MainColumeTag;
	}
	public void setMainColumeTag(String mainColumeTag) {
		MainColumeTag = mainColumeTag;
	}
	public String getCsvColumeTag() {
		return CsvColumeTag;
	}
	public void setCsvColumeTag(String csvColumeTag) {
		CsvColumeTag = csvColumeTag;
	}
	public String getFileOrgType() {
		return FileOrgType;
	}
	public void setFileOrgType(String fileOrgType) {
		FileOrgType = fileOrgType;
	}

	
}
