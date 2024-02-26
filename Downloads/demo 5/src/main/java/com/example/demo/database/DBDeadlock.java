package com.example.demo.database;

/**
 * There are different techniques to resolve deadlock.
 * 1. Connection timeout - In this technique transaction is forced to release a lock after certain period of time
 * and deadlock detection algorithms which periodically scan the transaction log for deadlock cycle and choose
 * one transaction to abort to resolve the deadlock.
 *
 * 2. Also possible to avoid deadlock by carefull design of transactions.
 *
 * Wait for graph is technique to detect lock.
 *
 * Deadlock prevention schemes
 * 1. Wait-Die scheme - check timestamp of Transactions , it kills the younger transaction and older transaction is
 *  allowed to wait till resources are getting free.
 * 2. Wound Wait Scheme - if an older transaction request for a resource held by younger transaction,
 * then an older transaction forces younger transaction to kill the transaction and release the resource.
 * If younger transaction is requesting resource that is held by an older one, then younger transaction is asked to wait
 * till the older transaction release one.
 */
public class DBDeadlock {
}
