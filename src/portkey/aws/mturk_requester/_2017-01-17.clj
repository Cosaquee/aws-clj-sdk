(ns portkey.aws.mturk-requester.-2017-01-17 (:require [portkey.aws]))

(def
 endpoints
 '{"sandbox"
   {:credential-scope {:service "mturk-requester", :region "sandbox"},
    :ssl-common-name "mturk-requester-sandbox.us-east-1.amazonaws.com",
    :endpoint
    "https://mturk-requester-sandbox.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "mturk-requester", :region "us-east-1"},
    :ssl-common-name "mturk-requester.us-east-1.amazonaws.com",
    :endpoint "https://mturk-requester.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
