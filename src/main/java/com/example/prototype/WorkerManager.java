package com.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class WorkerManager {

	List<Worker> workerList;

	WorkerManager() {
		workerList = new ArrayList<Worker>();
	}

	public void executeWorkers(ProfileContext context) {

		for (Worker worker : this.workerList) {
			try {
				worker.execute(context);
			} catch (Exception e) {
				worker.getHandler().handle(e, context);
			}
		}

	}
}
