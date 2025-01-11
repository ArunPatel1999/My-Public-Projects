package com.arun.exception;

import java.util.ArrayList;
import java.util.List;

public class EcommersException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private int code = -1;
	private String developerMessage;
	private List<String> errors = new ArrayList<>();
	private int errorCodeValue = -1;
	public final static int SUCCESSFUL_REQUEST = 200;
	public final static int SUCCESS = 201;
	public final static int NO_CONTENT = 204;
	public final static int BAD_REQUEST = 400;
	public final static int UNAUTHORIZED = 401;
	public final static int FORBIDDEN = 403;
	public final static int NOT_FOUND = 404;
	public final static int NOT_ACCEPTABLE = 406;
	public final static int CONFLICT = 409;
	public final static int UNSUPPORTED_MEDIA_TYPE = 415;
	public final static int UNPROCESSABLE_ENTITY = 422;
	public final static int UNIQUE_KEY_CONSTRAINT_VIOLATION = 409;
	public final static int MULTIPLE_RECORDS_FOUND = 409;
	public final static int SERVER_ERROR = 500;
	public final static int SERVER_ERROR_DUPLICATE_KEY = 501;
	public final static int SERVER_ERROR_REFERENCE_KEY = 502;
	public final static int SERVER_ERROR_LockTimeout_KEY = 503;
	public final static int SERVER_ERROR_NonUniqueResult_KEY = 504;
	public final static int SERVER_ERROR_NoResult_KEY = 505;
	public final static int SERVER_ERROR_OptimisticLock_KEY = 506;
	public final static int SERVER_ERROR_Persistence_KEY = 507;
	public final static int SERVER_ERROR_QueryTimeout_KEY = 508;
	public final static int SERVER_ERROR_Rollback_KEY = 509;
	public final static int SERVER_ERROR_TransactionRequired_KEY = 510;
	public final static int SERVER_ERROR_Jdbc_KEY = 511;
	public final static int SERVER_ERROR_ConstraintViolation_KEY = 512;
	public final static int SERVER_ERROR_Data_KEY = 513;
	public final static int SERVER_ERROR_JDBCConnection_KEY = 514;
	public final static int SERVER_ERROR_LockAcquisition_KEY = 515;
	public final static int SERVER_ERROR_SQLGrammar_KEY = 517;
	public final static int SERVER_ERROR_Annotation_KEY = 518;
	public final static int SERVER_ERROR_AssertionFailure_KEY = 519;
	public final static int SERVER_ERROR_Callback_KEY = 520;
	public final static int SERVER_ERROR_DuplicateMapping_KEY = 521;
	public final static int SERVER_ERROR_Instantiation_KEY = 522;
	public final static int SERVER_ERROR_InvalidMapping_KEY = 523;
	public final static int SERVER_ERROR_LazyInitialization_KEY = 524;
	public final static int SERVER_ERROR_NonUniqueObject_KEY = 525;
	public final static int SERVER_ERROR_ObjectDeleted_KEY = 526;
	public final static int SERVER_ERROR_ObjectNotFound_KEY = 527;
	public final static int SERVER_ERROR_PersistentObject_KEY = 528;
	public final static int SERVER_ERROR_PessimisticLock_KEY = 529;
	public final static int SERVER_ERROR_PropertyAccess_KEY = 530;
	public final static int SERVER_ERROR_PropertyNotFound_KEY = 531;
	public final static int SERVER_ERROR_PropertyValue_KEY = 532;
	public final static int SERVER_ERROR_Query_KEY = 533;
	public final static int SERVER_ERROR_QueryParameter_KEY = 534;
	public final static int SERVER_ERROR_Session_KEY = 535;
	public final static int SERVER_ERROR_StaleObjectState_KEY = 536;
	public final static int SERVER_ERROR_Transaction_KEY = 537;
	public final static int SERVER_ERROR_TransientObject_KEY = 538;
	public final static int SERVER_ERROR_TypeMismatch_KEY = 539;
	public final static int SERVER_ERROR_UnresolvableObject_KEY = 540;
	public final static int SERVER_ERROR_WrongClass_KEY = 541;
	public final static int SERVER_ERROR_Sqltimeout_KEY = 542;
	public final static int REQUEST_TIMEOUT = 408;
	public final static int DUPLICATE_RECORD_ERROR = 490;
	
	public EcommersException(Exception e) {
		super(e.getMessage());
	}

	public EcommersException(int code, String message) {
		super(message);
		this.code = code;
	}

	public EcommersException(int code, String message, String developerMessage) {
		super(message);
		this.code = code;
		this.developerMessage = developerMessage;
	}

	public EcommersException(int code, String message, String messageDescription, int errorCodeValue) {
		super(message);
		this.code = code;
		this.developerMessage = messageDescription;
		this.errorCodeValue = errorCodeValue;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDeveloperMessage() {
		return developerMessage;
	}
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public int getErrorCodeValue() {
		return errorCodeValue;
	}
	public void setErrorCodeValue(int errorCodeValue) {
		this.errorCodeValue = errorCodeValue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static int getSuccessfulRequest() {
		return SUCCESSFUL_REQUEST;
	}
	public static int getSuccess() {
		return SUCCESS;
	}
	public static int getNoContent() {
		return NO_CONTENT;
	}
	public static int getBadRequest() {
		return BAD_REQUEST;
	}
	public static int getUnauthorized() {
		return UNAUTHORIZED;
	}
	public static int getForbidden() {
		return FORBIDDEN;
	}
	public static int getNotFound() {
		return NOT_FOUND;
	}
	public static int getNotAcceptable() {
		return NOT_ACCEPTABLE;
	}
	public static int getConflict() {
		return CONFLICT;
	}
	public static int getUnsupportedMediaType() {
		return UNSUPPORTED_MEDIA_TYPE;
	}
	public static int getUnprocessableEntity() {
		return UNPROCESSABLE_ENTITY;
	}
	public static int getUniqueKeyConstraintViolation() {
		return UNIQUE_KEY_CONSTRAINT_VIOLATION;
	}
	public static int getMultipleRecordsFound() {
		return MULTIPLE_RECORDS_FOUND;
	}
	public static int getServerError() {
		return SERVER_ERROR;
	}
	public static int getServerErrorDuplicateKey() {
		return SERVER_ERROR_DUPLICATE_KEY;
	}
	public static int getServerErrorReferenceKey() {
		return SERVER_ERROR_REFERENCE_KEY;
	}
	public static int getServerErrorLocktimeoutKey() {
		return SERVER_ERROR_LockTimeout_KEY;
	}
	public static int getServerErrorNonuniqueresultKey() {
		return SERVER_ERROR_NonUniqueResult_KEY;
	}
	public static int getServerErrorNoresultKey() {
		return SERVER_ERROR_NoResult_KEY;
	}
	public static int getServerErrorOptimisticlockKey() {
		return SERVER_ERROR_OptimisticLock_KEY;
	}
	public static int getServerErrorPersistenceKey() {
		return SERVER_ERROR_Persistence_KEY;
	}
	public static int getServerErrorQuerytimeoutKey() {
		return SERVER_ERROR_QueryTimeout_KEY;
	}
	public static int getServerErrorRollbackKey() {
		return SERVER_ERROR_Rollback_KEY;
	}
	public static int getServerErrorTransactionrequiredKey() {
		return SERVER_ERROR_TransactionRequired_KEY;
	}
	public static int getServerErrorJdbcKey() {
		return SERVER_ERROR_Jdbc_KEY;
	}
	public static int getServerErrorConstraintviolationKey() {
		return SERVER_ERROR_ConstraintViolation_KEY;
	}
	public static int getServerErrorDataKey() {
		return SERVER_ERROR_Data_KEY;
	}
	public static int getServerErrorJdbcconnectionKey() {
		return SERVER_ERROR_JDBCConnection_KEY;
	}
	public static int getServerErrorLockacquisitionKey() {
		return SERVER_ERROR_LockAcquisition_KEY;
	}
	public static int getServerErrorSqlgrammarKey() {
		return SERVER_ERROR_SQLGrammar_KEY;
	}
	public static int getServerErrorAnnotationKey() {
		return SERVER_ERROR_Annotation_KEY;
	}
	public static int getServerErrorAssertionfailureKey() {
		return SERVER_ERROR_AssertionFailure_KEY;
	}
	public static int getServerErrorCallbackKey() {
		return SERVER_ERROR_Callback_KEY;
	}
	public static int getServerErrorDuplicatemappingKey() {
		return SERVER_ERROR_DuplicateMapping_KEY;
	}
	public static int getServerErrorInstantiationKey() {
		return SERVER_ERROR_Instantiation_KEY;
	}
	public static int getServerErrorInvalidmappingKey() {
		return SERVER_ERROR_InvalidMapping_KEY;
	}
	public static int getServerErrorLazyinitializationKey() {
		return SERVER_ERROR_LazyInitialization_KEY;
	}
	public static int getServerErrorNonuniqueobjectKey() {
		return SERVER_ERROR_NonUniqueObject_KEY;
	}
	public static int getServerErrorObjectdeletedKey() {
		return SERVER_ERROR_ObjectDeleted_KEY;
	}
	public static int getServerErrorObjectnotfoundKey() {
		return SERVER_ERROR_ObjectNotFound_KEY;
	}
	public static int getServerErrorPersistentobjectKey() {
		return SERVER_ERROR_PersistentObject_KEY;
	}
	public static int getServerErrorPessimisticlockKey() {
		return SERVER_ERROR_PessimisticLock_KEY;
	}
	public static int getServerErrorPropertyaccessKey() {
		return SERVER_ERROR_PropertyAccess_KEY;
	}
	public static int getServerErrorPropertynotfoundKey() {
		return SERVER_ERROR_PropertyNotFound_KEY;
	}
	public static int getServerErrorPropertyvalueKey() {
		return SERVER_ERROR_PropertyValue_KEY;
	}
	public static int getServerErrorQueryKey() {
		return SERVER_ERROR_Query_KEY;
	}
	public static int getServerErrorQueryparameterKey() {
		return SERVER_ERROR_QueryParameter_KEY;
	}
	public static int getServerErrorSessionKey() {
		return SERVER_ERROR_Session_KEY;
	}
	public static int getServerErrorStaleobjectstateKey() {
		return SERVER_ERROR_StaleObjectState_KEY;
	}
	public static int getServerErrorTransactionKey() {
		return SERVER_ERROR_Transaction_KEY;
	}
	public static int getServerErrorTransientobjectKey() {
		return SERVER_ERROR_TransientObject_KEY;
	}
	public static int getServerErrorTypemismatchKey() {
		return SERVER_ERROR_TypeMismatch_KEY;
	}
	public static int getServerErrorUnresolvableobjectKey() {
		return SERVER_ERROR_UnresolvableObject_KEY;
	}
	public static int getServerErrorWrongclassKey() {
		return SERVER_ERROR_WrongClass_KEY;
	}
	public static int getServerErrorSqltimeoutKey() {
		return SERVER_ERROR_Sqltimeout_KEY;
	}
	public static int getRequestTimeout() {
		return REQUEST_TIMEOUT;
	}
	public static int getDuplicateRecordError() {
		return DUPLICATE_RECORD_ERROR;
	}

}
