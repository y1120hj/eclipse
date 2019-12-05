package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016101500693387";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCJvas2MmB5Hf5Zm+4H8Y4wqHT4H0euxL+2RsYgAziMzyixyN3vLToZRDuK57PxccoMsaPoil3s908r+owN6HaAJyGpyPsPGWlyjDDAKLkFxfFBsOWgi24jpVtivOx4kG8IRe2PiVcVkc4/tUQDxS9ouyLfWl0/3IBMkP/Im6SilXO1mwlsgVFZLxX5ULoiJ7SSo+L4vqMg6vEBuL5Vwks+DijKl9mExQXBef/TKqjYBEc7tFcAvdxo8mR2T7JXBQsQ/KTd/FDjmPL0U1/ruXzbz1XPqizTNJcwAkvYs9hOmyC12lpkjXxMbxHCfL84iK1YNnGYSz3/2U3Fu59l10qbAgMBAAECggEAYsXUROUTMUdE4dVjd+bMZDAo0NT9fmIwZ/GQmdw1bSQQtoyoOZ9hDkVTvWQyMW27yiaIt3ShrhAaghsE2+RbNcLZ7Prmrgk3CKFnRCTvqSgsvUKxJ9NUg9NMGR4JJNvOA0zB8jA2do08LYs63slEGgI4G5qdS/I/PqisA5s5ECy0VfRk6FzugPhqRGGjr6lg6xWWnM8ONtGIWhcLcOyoLFlG39ubdojIZMfCNXmxwXD6tsLm9r5qmpPTxqwKyjpIRITkDORjVCp9gyqfdysZ8cryOhL+O04kGPi2kkBVP0WTENe9ICpxeykd+L1JKwQsx1nQkLlCu0tK2OdZWmPfAQKBgQDV6i8Y/8OWXjq+LM0Fapa5vPfFPK8AEJiQqPSINWf0ZTuTSDaglFBD3Bgtv7KuJv2qXHMLNAt3iGUhtjnZvOn1FSA8qogsbBoO89YZAQoVZf3Ys3OEpL/AS6YSCmWxblK2G5ZlUYVimnwPi4X5xbjQk/wDRcczLQ6zNt7VmU4F4QKBgQCk1vzXwWG4o3STbmhs9WBMwlTtw4aRL743DvhYKT4HfFHsdp83ULJ4TkYh1tSFjt4P/DnKjz59lKAYcbBuhTRIQf5lGOPw6SjQiQTgwn36/UEiyfP7Df0XABfl0Iii8gD6oxi3kHO1LF40ba4ucs39WAJu9lDzKE11FGrn/Tpn+wKBgQDRxCWPNC+N4rVkC/a4Wv+W//FQHuPVAnE5WhUBBK3+AM9c7DF1YjsbcFbddeA32tBhIOtHjy+3da8GUfWEyTX7OU41b1y9gvxCsWW/ez9yIGO+/qpG5m+KmCQwCLYUOgUtwvvGOxy7xpXlgIJOnk9Pae51HxXp30NNBn+Zog3awQKBgDRb+apKydCNUw01h8P8WR9opvNzJP5fDOuOPMI8L3DPQ3J55275mgbuzgYXqB/YVp77PhwiTfYzzHqXOjSQ6R9+nuDb/CNc3FMJAtylysB7y0HSpkX7loXEyNJ937jqZ/c08Tf1kVteAXpj0Gz+mIG9f+BhKythhOEIoECaRgAbAoGAdaQnrnMHD+72nOemHf/v8ZV+4pqGWaHL31D83uon1h3xq7DWN4cq2LlfH21O9qsD7t2ZkBfHpvUAsOM9GvXh1Nuzm49+7Q4RbxSoPiHQvOr9WYRFEo6LpINAkgLsQhlRxPVSZc0sSQIodCcyWn/l4ghL1WlCuT19BzEiOC8JhMM=";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjrEVFMOSiNJXaRNKicQuQdsREraftDA9Tua3WNZwcpeXeh8Wrt+V9JilLqSa7N7sVqwpvv8zWChgXhX/A96hEg97Oxe6GKUmzaZRNh0cZZ88vpkn5tlgL4mH/dhSr3Ip00kvM4rHq9PwuT4k7z1DpZAf1eghK8Q5BgxL88d0X07m9X96Ijd0yMkXArzD7jg+noqfbztEKoH3kPMRJC2w4ByVdweWUT2PwrlATpZZtYLmtDvUKG/sOkNAIKEMg3Rut1oKWpjyYanzDgS7Cg3awr1KPTl9rHCazk15aNYowmYtVabKwbGVToCAGK+qQ1gT3ELhkGnf3+h53fukNqRH+wIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
